package day44_Exceptions;

import java.util.NoSuchElementException;

public class multi_catchBlocks {
    public static void main(String[] args) {
        try {
            System.out.println(100/0);
        }catch (ClassCastException e){
            System.out.println("Class Cast");
        }catch (NoSuchElementException e){
            System.out.println("No such an element");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bound");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
