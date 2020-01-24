public class Array {
    public static void main(String[] args) {
        int number[]={0,1,2,3,4,5,6,7,8,9};
        int highest = number[0];



        for (int i = 1; i < number.length; i++)
        {
            System.out.println("inside for loop");
            System.out.println("before if satement" + highest);
            if (number[i] > highest){
                System.out.println("inside if staement");
            highest = number[i];
                System.out.println("after if satement" + highest);
        }
           }



        System.out.println("final" + highest);


    }
}
