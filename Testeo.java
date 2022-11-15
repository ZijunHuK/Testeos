
public class Testeo {
    
    public static final int EVEN_PARITY = 0;
    
    public static final int ODD_PARITY = 1;
    
    private int checkMode = EVEN_PARITY;
    
    private boolean decodeSuccess = false;
    
    private boolean errorSrc = false;
    
    private Integer errorIndex;
    
    public Testeo() {}
    
    public Testeo(int checkMode) {
        if (checkMode == ODD_PARITY) {
            this.checkMode = ODD_PARITY;
        } else {
            this.checkMode = EVEN_PARITY;
        }//if
    } //Testeo
    
    public String code  (String src) {
        if (src == null || src.equals("")) {
            return "no ha puesto nada";
        } //if
        String[] srcArray = src.trim().split("");
        for (String srcChar : srcArray) {
            if (!srcChar.equals("0") && !srcChar.equals("1")) {
                return "error caracter";
            } //if
        } //for
        
        int n = src.length();
        int x = 0;
        while ((1 << x) - 1 < n + x) x++;
        
        int[] resultArray = new int[n + x];
        for (int i = 0, j = 0, checkIndex = 1; i < resultArray.length; i++)
            if (checkIndex == i + 1) {
                checkIndex = checkIndex << 1;
            } else {
                resultArray[i] = Integer.parseInt(srcArray[j++]);
            } //if            
        return null;
    } //Code
    
    
    
    
    
    
    
    
    
} //Testeo
