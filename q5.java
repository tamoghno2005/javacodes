class q5{
    public static void main(String[] args){    
        EvenSum();
    }

    static void EvenSum(){          
        int sum = 0;
        for (int i = 1; i <= 20; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("The sum of Even numbers from 1 to 20 is: " + sum);
    }
}