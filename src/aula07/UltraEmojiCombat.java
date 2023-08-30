package aula07;
//Programa Principal
public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador[] l = new Lutador[6];
        l[0] = new Lutador("SrFodão", "França", 27, 1.82f, 104.9f, 11, 3, 1);
        l[1] = new Lutador("Putão", "Brasil", 25, 1.72f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Sorriso", "EUA", 31, 1.65f, 62.4f, 12, 2, 1);
        l[3] = new Lutador("MorteSagrenta", "Austrália", 33, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Etvaldo", "Jamaica", 35, 1.88f, 102.3f, 17, 3, 0);
        l[5] = new Lutador("Evertonc15", "Belgíca", 25, 1.72f, 82.2f, 22 , 0, 4);
        Luta UEC1 = new Luta();
        UEC1.marcar_Luta(l[4], l[0]);
        UEC1.lutar();
        l[4].status();
        l[0].status();
        Luta UEC2 = new Luta();
        UEC2.marcar_Luta(l[1], l[2]);
        UEC2.lutar();
        l[1].status();
        l[2].status();
        Luta UEC3 = new Luta();
        UEC3.marcar_Luta(l[3], l[5]);
        UEC3.lutar();
        l[3].status();
        l[5].status();
    }
}
