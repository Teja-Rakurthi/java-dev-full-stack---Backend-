public class StudentsGRade{
    public static void main(String[]args){
        String[] names={"Teja","Chintu","Abhi","Buddamma","Bhavi"};

        int[][] marks={
                {70, 75, 78},
                {90, 92, 98},
                {95, 92, 90},
                {70, 80, 75},
                {88, 84, 91}
        };
        double[] avg= new double[5];
        for(int i=0;i< marks.length;i++){
            int sum=0;
            for(int j=0; j<marks[i].length;j++){
                sum+=marks[i][j];
            }
            avg[i]=(double) sum/marks[i].length;

            }
        for(int i=0; i< avg.length-1;i++){
            for(int j=i+1; j<avg.length;j++){
                if(avg[i]<avg[j]){
                    double temp = avg[i];
                    avg[i]=avg[j];
                    avg[j]=temp;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
        System.out.println("Rank list");
        for(int i=0; i<avg.length;i++){
            System.out.println((i+1)+". "+names[i]+"-> Avg ="+avg[i]+"--->Rank "+(i+1));
        }

        }
    }
