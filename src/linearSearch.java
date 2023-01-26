public class linearSearch {
    public static void main(String[] args) {
        String[] kata = {"WILL","YAM","PIW","CLAP","LIAM","TAY","LOR","BIL"};

        //System.out.println(linierSearch(intArray, -99));

        if(liniearSearch(kata,"LIAM") == -1){
            System.out.println("Data tidak ditemukan");
        } else{
            System.out.println("Data ditemukan pada index ke " + liniearSearch(kata, "LIAM"));
        }

    }

    public static int liniearSearch(String[] input, String value){
        for(int i=0; i < input.length; i++){
            if(input[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
