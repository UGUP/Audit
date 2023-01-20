package com.datdyn.client;

import org.hyperledger.fabric.gateway.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConnectionProfile {


    public static Contract getContractInstance() throws Exception {
        //Maintaining the directories to manage teh identities
        String _dir = System.getProperty("user.dir");
        System.out.println(" The directory is"+_dir);
        Path walletPath = Paths.get(_dir,"AuditClient", "wallet");
        Wallet wallet = Wallets.newFileSystemWallet(walletPath);
        // load a CCP
        Path networkConfigPath = Paths.get(_dir, "test-network", "organizations", "peerOrganizations", "org1.example.com", "connection-org1.json");
//
//        BufferedReader br = new BufferedReader(new FileReader(String.valueOf(networkConfigPath)));
//        String line;
//
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }

        Gateway.Builder builder = Gateway.createBuilder();
        builder.identity(wallet, "admin").networkConfig(networkConfigPath).discovery(true);
        System.out.println(" The identity is successfully build");

        // create a gateway connection
        Gateway gateway = builder.connect();
        // get the network and contract
        Network network = gateway.getNetwork("mychannel");
        Contract contract = network.getContract("FileAudit");
        return contract;
    }

}

