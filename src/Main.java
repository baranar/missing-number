import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();          // asıl liste
        Random random = new Random();                               // Random nesnesi: Random sayı üretebilmek için
        ArrayList<Integer> copyNumberList = new ArrayList<>();      // kopya liste

        for (int i=0; i<100 ; i++){                                 // Asıl listeye random sayılar ekliyorum
            int randomNumber = random.nextInt(100);          // 0-100 arasında random sayı üret
            numberList.add(randomNumber);
            copyNumberList.add(randomNumber);      //Ürettiğim sayıyı asıl listeye de kopyaya aynı anda eklemek istedim.
        }

        //0-100 arasında rastgele bir sayı seç. Bu sayıyı index kabul et ve o indexteki elemanı sil
        copyNumberList.remove(random.nextInt(100));

        System.out.println(missingNumber(numberList, copyNumberList));
    }

    public static int sum(ArrayList<Integer> list){
        int sum = 0;
        for (int number: list){
            sum += number;
        }
        return sum;
    }

    //Ödevde istenen eksik sayıyı bulan metod:
    public static int missingNumber(ArrayList<Integer> list1, ArrayList<Integer> list2){
        /* Elimizde iki tane aynı liste olsaydı bu listedeki elemanların toplamları aynı olurdu.
        Arada sadece bir eleman eksik olduğu için iki listenin toplamı arasındaki fark eksik elemanımıza eşittir.  */

        int difference = sum(list1) - sum(list2);
        return difference;
    }
}