class object{
    public static void main(String[] args){
        String s1 = "Rahul";
        //s1.concat("Gandhi");
        s1=s1.concat(s1);

        // System.out.println(s1);     //Rahul
        System.out.println(s1);     //RahulGandhi

        StringBuffer s2 = new StringBuffer("Rahul");
        s2.append("Gandhi");

        System.out.println(s2);    //RahulGandhi

        String s3 = "Rahul";
        s3 = s3.concat("Gandhi");

        System.out.println(s3);     //RahulGandhi

    }
}