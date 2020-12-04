interface EncryptionAlgorithm {
  encrypt();
  decrypt();
}

class AESEncryption implements EncryptionAlgorithm{

  encrypt(){
  /*Code to encrypt data using AES algorithm*/
  }

  decrypt(){
  /*Code to decrypt data using AES algorithm*/
  }
}

class BlowfishEncryption implements EncryptionAlgorithm{

  encrypt(){
  /*Code to encrypt data using Blowfish algorithm*/
  }

  decrypt(){
  /*Code to decrypt data using Blowfish algorithm*/
  }
}


public class Message {
    private String text;
    private EncryptionAlgorithm algo;


    public Message(EncryptionAlgorithm algo){
       this.algo =algo;
   }
   public string getText(){
        return this.algo.decrypt(text);
   }
   public void setText(String text){
         text = this.algo.encrypt(text);
   } 
}
