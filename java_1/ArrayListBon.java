package DataStructure;

public class ArrayListBon {

	int c = 2;
	int p = 0; //����Ʈ�� ������
	Object a[] = new Object[c];	
  	Object empty[] = new Object[c];
	
	// add �޼ҵ� �������� (���� ����Ʈó�� �������̷� ����)
	public void add(Object input) {	
		a[p] = input;
		p++;
		
		if (p == c) {
			Object b[] = new Object[c * 2];		
					
			for (int i=0;i<c;i++) {
				 b[i] = a[i];				 
			}
			a = b;
			c =  c*2;			
			}					
	}
	// add �޼ҵ�����ε�(�ε��� ����)
	public void add(int index,Object input) {
		    ++p;
		    
		    //a�迭�� Ŭ���� ����
			Object b[] = new Object[p];
			//b = a;
						
			for (int i=0;i<p;i++) {
				 b[i] = a[i];				 
			}
			
			
			if (p == c) {
				Object d[] = new Object[c * 2];		
						
				for (int i=0;i<c;i++) {
					 d[i] = a[i];				 
				}
				a = d;
				c =  c*2;			
				}		
			
			//Ŭ���� a�迭���� �������� �ε��� +1 �Ѱ��� ����
			// a = [1,2,3,4,5] => a = [1,2,2,3,4,5]
			for(int i=index;i<p;i++ ) {
				a[i + 1] = b[i];
				
			}
			// ������ �ڸ��� ���� ���� ����
			a[index] = input;												
	}
	
	// addAll() ���� => ������ �ʿ�
	public void addAll(Object[] input) {
		for (Object var: input) {
			a[p] = var;
			p++;
			
			if (p == c) {
				Object b[] = new Object[c * 2];		
						
				for (int i=0;i<c;i++) {
					 b[i] = a[i];				 
				}
				a = b;
				c =  c*2;			
				}			
		}										
	}

	public void remove(int index) {
		Object b[] = new Object[a.length];
		int i =0;
		
		for(Object var: a) {
		 if(var == a[index]) {
			 continue;
	     }else {
	    	 b[i] = var;
	    	 i ++;
		
	     }
	}
		a = b;
		p--;
	   System.out.println(p);
}
	
	//Ȯ���� ���� �Ͻ������� ���� ����Ʈ �޼ҵ�
	public void print() {
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == null) {
				continue;
			}else {
				System.out.print(a[i]+" ");	
			}
		}System.out.println("]");
	}
	
	
	// size() ����
  public int size() {
	  return p;
	  	  	
  }
  
  // clear() ����
  public void clear() {
	  p = 0;
	  c = 2;
	  a = empty;
  }
  
  //isEmpty() ����
  
  public boolean isEmpty() {
	  if (a == empty) {
		  return true;
	  }else {
		  return false;
	  }
  }
  
  public static void main(String[] args) {
	ArrayListBon list = new ArrayListBon();
	ArrayListBon list2 = new ArrayListBon();
	
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.print();
	
	
	list.add(5, 20);
	list.add(1, 10);
	list.add(2, 30);
	
	
	
	list.print();
	System.out.println(list.size());
	
	list.clear();
	System.out.println(list.isEmpty());
	
    
	list2.add(1);
	list2.add(2);
	list2.add(3);
    Object array[] = {1,2,3,4,5,6};
	
	
    list.addAll(array);
    
    list.print();
    
    list.remove(1);
    list.print();
    
    list.remove(1);
    list.print();
    
    list.remove(1);
    list.print();
    
    list.remove(0);
    list.print();
    list.remove(0);
    list.print();
    list.remove(0);
    list.print();
    
    
    
   
    
    
}
    
}
