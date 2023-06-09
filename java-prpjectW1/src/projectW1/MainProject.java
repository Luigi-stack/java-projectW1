package projectW1;
import java.util.Scanner;


public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        starter();
	}

	public static elementoMultimediale[] lista = new elementoMultimediale[5];

    public static void starter() {
        Scanner input = new Scanner(System.in);
        System.out.println("premi 1 per caricare  i file\npremi 2 vuoi leggere i file");
        int e = input.nextInt();
        input.nextLine();
        switch (e) {
            case 1:
                createArray();
                break;
            case 2:
                readFiles();
                break;
        }
    }

        public static void createArray() {
            for (int i = 0; i < lista.length; i++) {
                nuovoElemento(i);
            }
            readFiles();
        }

        public static void nuovoElemento (int i){
            Scanner input = new Scanner(System.in);
            System.out.println("Creare il tuo elemento n:" + (i + 1));
            System.out.println("Seleziona il tipo di file:\n1: video\n2: immagine\n3: file audio");
            int e = input.nextInt();
            input.nextLine();

            switch (e) {
                case 1:
                    System.out.println("nome video:");
                    String nomeVideo = input.nextLine();
                    System.out.println("quanto dura il video?:");
                    int drtVideo = input.nextInt();
                    input.nextLine();
                    System.out.println("luminosità video:");
                    int lumVideo = input.nextInt();
                    input.nextLine();
                    video v1 = new video(nomeVideo, drtVideo, lumVideo);
                    System.out.println(v1.nome);
                    lista[i] = v1;
                    break;
                case 2:
                    System.out.println("nome img:");
                    String nomeImg = input.nextLine();
                    System.out.println("luminosità immagine:");
                    int lumImg = input.nextInt();
                    input.nextLine();
                    immagine i1 = new immagine(nomeImg, lumImg);
                    lista[i] = i1;
                    break;
                case 3:
                    System.out.println("nome audio:");
                    String nomeAudio = input.nextLine();
                    System.out.println("quanto dura l'audio?:");
                    int drtAudio = input.nextInt();
                    input.nextLine();
                    audio a1 = new audio(nomeAudio, drtAudio);
                    System.out.println(a1.nome);
                    lista[i] = a1;
                    break;
                default:
                    System.out.println("comando errato");
            }
        }

        public static void readFiles() {
            Scanner input = new Scanner(System.in);
            System.out.println("premi 1 per sapere i file salvato\nper salvare nuovi file premi 2\nper leggere un singolo file premi 3");
            int e = input.nextInt();
            input.nextLine();
            switch (e) {
                case 1:
                    listFile();
                    break;
                case 2:
                    createArray();
                    break;
                case 3:
                    readOneFile();
                    break;
            }
        }

        public static void listFile() {
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i].getNome());
            }
        }

        public static void readOneFile() {
            Scanner input = new Scanner(System.in);
            int e = input.nextInt();
            input.nextLine();
            switch (e) {
                case 1:
                    System.out.println(lista[e].getNome());
                    break;
                case 2:
                    System.out.println(lista[e].getNome());
                    break;
                case 3:
                    System.out.println(lista[e].getNome());
                    break;
                case 4:
                    System.out.println(lista[e].getNome());
                    break;
                case 5:
                    System.out.println(lista[e].getNome());
                    break;
                case 6:
                    listFile();
                    break;

            }

        }
	
}
