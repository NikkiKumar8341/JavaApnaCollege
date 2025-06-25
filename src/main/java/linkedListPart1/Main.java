package linkedListPart1;

public class Main {

    public static void main(String[] args) {

        LL linkList = new LL();
        linkList.insertLast(55);
        linkList.insertFirst(40);
        linkList.insertFirst(50);
        linkList.insertFirst(41);

        linkList.insertLast(65);
        linkList.display();

        linkList.insert(2, 2);

        linkList.display();

        System.out.println( linkList.deleteFirst());

        linkList.display();

        linkList.insert(80,4);

         linkList.display();

        System.out.println( linkList.deleteLast());

        linkList.display();

        System.out.println(linkList.delete(2));

        linkList.display();

        System.out.println(linkList.search(65));

        linkList.reverse();

        linkList.display();

        linkList.insertLast(69);
        linkList.display();


        System.out.println(linkList.get(2));

        System.out.println(linkList.recSearch(69));

        System.out.println(linkList.recSearch(52));

        linkList.display();

//first linked list
        LL first = new LL();
        int arr1[] = {1, 3, 4, 6};
        first.insertArr(arr1);
        first.display();

        LL second = new LL();
        int arr2[] = {1, 2, 3, 9, 14, 56};
        second.insertArr(arr2);
        second.display();

        //merge sort the first and second linked list

        LL ll=LL.merge(first,second);

        ll.display();








    }
}
