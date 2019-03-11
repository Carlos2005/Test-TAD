public class Lista{

  private Nodo head=null;

  private class Nodo{
  
    public int entero;
    public Nodo next = null;
    
    public Nodo (int entero){
      this.entero=entero;
    }
  }
  
  public void insertBeginning(int entero){
    
    Nodo nodo = new Nodo(entero);
    nodo.next = head;
    head = nodo;   
  
  }
  
  public void insertEnd(int entero){
    Nodo nodo = new Nodo(entero);
    
    if(head == null){
        head = nodo;
    }    
    else{
    
        Nodo pointer = head;
        while (pointer.next!=null ){
          pointer = pointer.next;

        }
        pointer.next = nodo;  
     }
  
}
