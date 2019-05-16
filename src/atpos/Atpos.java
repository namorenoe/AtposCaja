/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atpos;

import com.mongodb.*;
/**
/**
 *
 * @author na.morenoe
 */
public class Atpos {

    /**
     * @param args the command line arguments
     */

 * Java basic MongoDB connection.
 * Conexión básica en Java a MongoDB.
 * @author xules
 */
public class JavaBasicMongodb {
    /**
     * Testing Java basic Mongodb connection.
     * Probando la conexión básica en Java a Mongodb.
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        MongoClient mongoClient = new MongoClient();
        MongoDatabase db = mongoClient.getDatabase("test");
    }    
}
    
}
