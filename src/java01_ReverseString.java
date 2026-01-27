import java.util.Arrays;

class Java01_ReverseString {
    public static void main(String[] args) {
        String str = "AtulAgnihotri";
        reverse1(str);
        reverse2(str);
        reverse3(str);
    }
    public static void reverse1(String str){
        System.out.println("String to reverse :: "+str);
        String ans = "";
        for(int i = str.length()-1; i>=0; i--){
            ans = ans + str.charAt(i);
        }
        System.out.println("reverse1");
        System.out.println(ans);
    }
    public static void reverse2(String str){
        char[] arr = str.toCharArray();
        int i=0, j=arr.length-1;
        while(i<=j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i+=1;
            j-=1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(arr);
        System.out.println("reverse2");
        System.out.println(sb);
    }
    public static void reverse3(String str){
        char[] arr = str.toCharArray();
        int i=0, j=arr.length-1;
        while(i<=j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i+=1;
            j-=1;
        }
        System.out.println("reverse3");
        System.out.println(Arrays.toString(arr));
    }
}
