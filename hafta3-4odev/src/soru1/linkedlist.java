package soru1;

public class linkedlist<T> {
	
	public queue son;
    public int count = 0;
    public void basaEkle(T value) {
    	queue temp = new queue(value);

        if (son == null)
        	son = temp;
        else {
            temp.Next = son;
            son = temp;
        }
        count++;
    }
    public void sonaEkle(T value) {
    	queue temp = new queue(value);
    	
        	queue sayac = son;
            while (sayac.Next != null)
                sayac = sayac.Next;
            sayac.Next = temp;
        }
   
    

    public void delete(int pozisyon) {
        
    	queue sayac = son;
    	queue temp = new queue(sayac);
            for (int i = 1; i < pozisyon - 1; i++) {
                if (sayac.Next != null)
                    sayac = sayac.Next;
            }
            temp = sayac;
            sayac = sayac.Next;
            temp.Next = sayac.Next;
            sayac = null;
            count--;
        }


} 
