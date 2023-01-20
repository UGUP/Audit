package org.hyperledger.fileaudit;

// Java Implementation of File Auditing smart Contract....

import com.owlike.genson.Genson;
import org.hyperledger.fabric.contract.Context;
import org.hyperledger.fabric.contract.ContractInterface;
import org.hyperledger.fabric.contract.annotation.*;
import org.hyperledger.fabric.shim.ChaincodeStub;
import org.hyperledger.fabric.shim.ledger.KeyModification;
import org.hyperledger.fabric.shim.ledger.QueryResultsIterator;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.Iterator;


@Contract(
        name = "FileAudit",
        info = @Info(
                title = "FileAudit contract",
                description = "The hyperledger File Audit contract",
                version = "0.0.1-SNAPSHOT",
                license = @License(
                        name = "Apache 2.0 License",
                        url = "http://www.apache.org/licenses/LICENSE-2.0.html"),
                contact = @Contact(
                        email = "f.audit@example.com",
                        name = "File Audit",
                        url = "https://hyperledger.example.com")))


@Default
public final class FileAudit implements ContractInterface {

    private enum FileAuditErrors{
        FILE_NOT_FOUND,
        FILE_ALREADY_EXISTS;
    }

    /** Init function to verify if the chaincode is successfully instantiated..
     *
     * @param ctx Context of the transaction
     * @return string for the successful instantiation.
     */
      @Transaction
      public String init(Context ctx){
        return "The chaincode has been successfully initialized";
      }


    /**
     * Stores the Data in the ledger against a specified key.
     *
     * @param ctx the transaction context
     * @param request passed as a json object
     * @return string confirming if details are successfully added to blockchain.
     */

    @Transaction
    public String createFileDetails(Context ctx,String request) {
        System.out.println(" have enetered");
        JSONObject requestObject=new JSONObject(request);
        String key=requestObject.getString("fileResearchHash");
        ChaincodeStub stub = ctx.getStub();
        Genson genson = new Genson();
        String fileData=stub.getStringState(key);
        if(!fileData.isEmpty()){
            return FileAuditErrors.FILE_ALREADY_EXISTS.toString();
        }
        System.out.println(" the request is"+request);
        System.out.println(" the key is "+key);
        stub.putStringState(key, request);
        return " File Details are successfully stored in Blockchain";
    }


    /**
     * Retrieves a file details with the specified key from the ledger.
     * @param ctx the transaction context
     * @param key the key
     * @return the file details found on the ledger if there was one
     */
    @Transaction
    public String getFileDetails(Context ctx,String key){
        System.out.println(" the key passed is"+key);
        ChaincodeStub stub=ctx.getStub();

        String fileDetails =stub.getStringState(key);
        System.out.println(" the file details retrieved are"+fileDetails);
        if(fileDetails.isEmpty()){
            return FileAuditErrors.FILE_NOT_FOUND.toString();
        }
        return fileDetails;
    }



    /**
     * Updates the Data in the ledger against a specified key.
     *
     * @param ctx the transaction context
     * @param request passed as a json object
     * @return string confirming if details are successfully added to blockchain.
     */
    @Transaction
    public String updateFileDetails(Context ctx,String request) {
        JSONObject requestObject=new JSONObject(request);
        System.out.println(" teh json object is "+requestObject);
        String key=requestObject.getString("fileResearchHash");
        ChaincodeStub stub = ctx.getStub();
        Genson genson = new Genson();
        String fileData=stub.getStringState(key);
        System.out.println(" the file details are "+fileData);
        if(fileData.isEmpty()){
            return FileAuditErrors.FILE_NOT_FOUND.toString();
        }
        System.out.println(" the request is"+request);
        System.out.println(" the key is "+key);
        stub.putStringState(key, request);
        return " File Details are successfully Updated in Blockchain";
    }


    /**
     * Gets the history of changes made to a specified file
     *
     * @param ctx the transaction context
     * @param  fileResearchHash as a key to get the history of a specified file
     * @return array with the history of all the updates done to a specified file
     */
    @Transaction
    public String QueryFileHistory(Context ctx, String fileResearchHash) throws Exception {
        ChaincodeStub   stub = ctx.getStub();
        ArrayList<String> history= new ArrayList();
        if(fileResearchHash==null){
             history.add("Invalid  fileResearchHash");
             return history.toString();
        }
        try {
            System.out.println(" the identifier is........................................."+fileResearchHash);
            QueryResultsIterator<KeyModification> results = stub.getHistoryForKey(fileResearchHash);
            if (results == null) {
                history.add(FileAuditErrors.FILE_NOT_FOUND.toString());
                return history.toString();
            }
            Iterator<KeyModification> itr = results.iterator();
            while (itr.hasNext()) {
                System.out.println(" i have entered the while loopp");
                String iteratorValue= itr.next().getStringValue();
               // String iteratorValue= "Timestamp " + itr.next().getTimestamp().toString() + " \n TransactionId " + itr.next().getTxId() + "\n Transaction record  " + itr.next().getStringValue();
                //history.add("Timestamp "+itr.next().getTimestamp().toString()+"\n"+"TransactionId "+itr.next().getTxId()+"\n"+"TransactionValue "+iteratorValue);
               //history.add("Timestamp "+itr.next().getTimestamp().toString()+"\n"+"TransactionId "+itr.next().getTxId()+"\n"+"TransactionValue "+iteratorValue);
             //history.add(itr.next().getTxId());
             //history.add(itr.next().getTimestamp().toString());
           //this doesnt work ??????????13 may 1991
             //history.add("Timestamp "+itr.next().getTimestamp().toString()+"\n"+"TransactionId "+itr.next().getTxId()+"\n"+"TransactionValue "+iteratorValue);
                //THis works
            history.add(iteratorValue);
            }
            results.close();
            System.out.println(" the value of history is"+history);
        }
        catch(Exception e) {
//             history.add(e.getMessage());
//             history.add(e.getCause().getMessage());
//             history.add(e.getStackTrace().toString());
            System.out.println(" the errror is"+e);
            }
        return history.toString();
    }







}
