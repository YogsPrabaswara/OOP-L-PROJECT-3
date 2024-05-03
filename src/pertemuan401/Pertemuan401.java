package pertemuan401;

/**
 *
 * NAMA Yoga Prabaswara
 * NIM 2201010057
 * DATE 23-04-2024
 */
public class Pertemuan401 {

    public static void main(String[] args) {
            BukuTeman BTeman = new BukuTeman();
            String ul = "Ya";
            do{
                System.out.println("A. View Data");
                System.out.println("B. Add Data");
                System.out.println("C. Edit Data");
                System.out.println("D. Delete Data");
                System.out.println("E. Exit");
                System.out.print("Choose Option A/B/C/D/E : ");
                String mPIL = BTeman.dtIN.nextLine();
                switch (mPIL) {
                case "A":
                    BTeman.viewdata();
                    break;
                case "B":
                    BTeman.StoreData();
                    break;
                case "C":
                    System.out.print("Enter the Record Number to Update: ");
                    int updateIdx = Integer.parseInt(BTeman.dtIN.nextLine());
                    BTeman.Update(updateIdx);
                    break;
                case "D":
                    System.out.print("Enter the Record Number to delete: ");
                    int deleteIdx = Integer.parseInt(BTeman.dtIN.nextLine());
                    BTeman.Destroy(deleteIdx);
                    break;
                case "E":
                    ul = "Tidak";
                    break;
                default:
                    System.out.println("type A/B/C/D");
                    break;
            }
        }while(ul.equals("Ya")); 
                
    }
    
}
