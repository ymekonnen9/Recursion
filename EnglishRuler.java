public class EnglishRuler {
    public static void drawRuler(int nInches, int markLength){
        drawLine(markLength, 0);
        for(int i=1; i<=nInches;i++){
            drawInterval(markLength -1);
            drawLine(markLength, i);
        }
    }

    public static void drawInterval(int centralLength){
        if(centralLength >= 1){
            drawInterval(centralLength-1);
            drawLine(centralLength);
            drawInterval(centralLength-1);
        }

    }

    public static void drawLine(int tickLength,int tickLabel){
        for(int i =0; i< tickLength; i++){
            System.out.print("-");
        }
        if(tickLabel >= 0){
            System.out.print(""+tickLabel);
        }
    }

    public static void drawLine(int tickLength){
        drawLine(tickLength, -1);
    }
    
}
