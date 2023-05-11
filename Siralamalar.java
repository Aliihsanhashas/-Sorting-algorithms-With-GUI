package siralamaguı;
public class Siralamalar {
    Eleman[] dizi;
    int tane, sayac = 0;
    private String secilen;
    String olustur(int N){
        dizi = new Eleman[N];
        int sayi;
        String sayilar = "";
        for (int i = 0; i < dizi.length; i++) {
            sayi = (int)(Math.random()*1000);
            sayilar += sayi + " ";
            Eleman eleman = new Eleman(sayi);
            dizi[i] = eleman;
        }
        tane = 0;
        
        return sayilar;
    }
    
    boolean bosMu(){
        return tane == 0;
    }
    
    void yukariCik(int no){
        int ata = (no-1)/2;
        while(ata >= 0 && dizi[ata].icerik < dizi[no].icerik){
            Eleman ara = dizi[ata];
            dizi[no] = ara;
            no = ata;
            ata = (no-1)/2;
        }
    }
    
    void ekle(Eleman yeni){
        tane++;
        dizi[tane-1] = yeni;
        yukariCik(tane-1);
    }
    
    void asagiIn(int no){
        int altsol = 2*no+1, altsag = 2*no+2;
        
        while((altsol < tane && dizi[no].icerik < dizi[altsol].icerik) || (altsag < tane && dizi[no].icerik < dizi[altsag].icerik)){
            if(altsag >= tane || dizi[altsol].icerik > dizi[altsag].icerik){
                Eleman ara = dizi[no];
                dizi[no] = dizi[altsol];
                dizi[altsol] = ara;
                no = altsol;
            }
            else{
                Eleman ara = dizi[no];
                dizi[no] = dizi[altsag];
                dizi[altsag] = ara;
                no = altsag;
            }
            altsol = 2*no+1;
            altsag = 2*no+2;
        }
    }
    
    Eleman azamiDondur(){
        if(!bosMu()){
            Eleman tmp = dizi[0];
            dizi[0] = dizi[tane-1];
            asagiIn(0);
            tane--;
            return tmp;
        }
        else  return null;
    }
    
    void yazdir(){
        for (int i = 0; i < tane/2; i++) {
            int sol = 2*i+1;
            int sag = 2*i+2;
            
            System.out.println("Ata dugum: " + dizi[i].icerik);
            if(sol < tane){
                System.out.println("sol cocuk: " + dizi[sol].icerik);
            }
            if(sag < tane){
                System.out.println("sag cocuk:" + dizi[sag].icerik);
            }
        }
    }
    
    void yiginSiralama(int A[]){
        int i;
        Eleman e;
        Siralamalar y;
        
        y = new Siralamalar();
        y.olustur(A.length);
        
        for (i = 0; i < A.length; i++) {
            e = new Eleman(A[i]);
            y.ekle(e);
        }
        
        for (i = 0; i < A.length; i++) {
            e = y.azamiDondur();
            A[i] = e.icerik;
        }
    }
    
    double time;
    long startTime, endTime;
    
    int[] selectionSort(int A[], int n){
        int tmp;
        int min;
        double passTime;
        startTime = System.currentTimeMillis();
        for(int i=0; i < n-1; i++){
            min=i;

            for(int j=i; j < n; j++){
                if (A[j] < A[min]){
                    min=j;
                    sayac++;
                }
            }
            tmp=A[i];
            A[i]=A[min];
            A[min]=tmp;
        }
        endTime = System.currentTimeMillis();
        
        time += (endTime - startTime)/1000;
        return A;
    }
    
    int[] quickSort(int[] A, int bas, int son){
        startTime = System.currentTimeMillis();
        if (bas < son) {
            int pi = bölme(A, bas, son);
            quickSort(A, bas, pi - 1);
            quickSort(A, pi + 1, son);
            sayac++;
        }
        endTime = System.currentTimeMillis();
        time = (endTime - startTime)/1000;
        return A;
    }
    
    static void degistir(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    
    int bölme(int[] A, int bas, int son){
        
        int pivot = A[son];
        int i = (bas - 1);
  
        for (int j = bas; j <= son - 1; j++) {
            if (A[j] < pivot) {
                i++;
                degistir(A, i, j);
            }
        }
        degistir(A, i + 1, son);
        return (i + 1);
    }
    
    void merge(int A[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
 
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = A[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = A[m + 1 + j];
 
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            }
            else {
                A[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }
    }
 
    int[] mergeSort(int A[], int l, int r){
        startTime = System.currentTimeMillis();
        if (l < r) {
            int m = l + (r - l) / 2;
 
            mergeSort(A, l, m);
            mergeSort(A, m + 1, r);
 
            merge(A, l, m, r);
            sayac++;
        }
        endTime = System.currentTimeMillis();
        time = (endTime - startTime)/1000;
        return A;
    }
    
    int[] bubbleSort(int[] A){
        int tmp;
        startTime = System.currentTimeMillis();
        for(int i=0; i<A.length; i++){
            for(int j=A.length-1; j>i; j--){
                if(A[j-1] > A[j]){
                    tmp=A[j-1];
                    A[j-1]=A[j];
                    A[j]=tmp;
                    sayac++;
                }
            }
        }
        endTime = System.currentTimeMillis();
        time = (endTime - startTime)/1000;
        return A;
    }

    /**
     * @return the secilen
     */
    public String getSecilen() {
        return secilen;
    }

    /**
     * @param secilen the secilen to set
     */
    public void setSecilen(String secilen) {
        this.secilen = secilen;
    }
}

class Eleman {
    int icerik;
    Eleman(int icerik){
        this.icerik = icerik;
    }
}