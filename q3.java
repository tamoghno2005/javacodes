class q3{
    public static void main(String[] args){
        GreatestAndSmallest(args);           
    }

     static void GreatestAndSmallest(String[] args){
        if (args.length < 3){
            return;                
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int sum = num1 + num2;
        int largestnum = (num1 > num2) ? num1 : num2;
        int smallestnum = (sum < num3) ? sum : num3;
        System.out.println("The Greatest of two numbers is: " + largestnum);
        System.out.println("The smallest number is: " + smallestnum);
    }
}