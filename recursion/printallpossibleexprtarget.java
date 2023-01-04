import java.util.*;
public class printallpossibleexprtarget {
    public static void main(String[] args) {
        String input = "123";
        int target = 6;
        ArrayList<String> res = getExprs(input, target);
        printResult(res);
 
        input = "125";
        target = 7;
        res = getExprs(input, target);
        printResult(res);
    }
    static void getExprUtil(ArrayList<String> res,String curExp,String input,int target,int pos,int curval,int last){
        if(pos==input.length()){
            if(curval==target)
                res.add(curExp);
                return;
            
        }
        for(int i=pos;i<input.length();i++){
            if(i!=pos && input.charAt(pos)=='0')
                break;

                String part=input.substring(pos, i+1);
                int cur=Integer.parseInt(part);
                if(pos==0){
                    getExprUtil(res, curExp+part, input, target, i+1, cur, cur);
                }else{
                    getExprUtil(res, curExp+"+"+part, input, target, i+1, curval, last);
                    getExprUtil(res, curExp+"-"+part, input, target, i+1, curval, last);
                    getExprUtil(res, curExp+"*"+part, input, target, i+1, curval-last+last*cur, last*cur);


                    }
                }

            
        }
        static ArrayList<String> getExprs(String input,int target){
            ArrayList<String> res=new ArrayList<String>();
            getExprUtil(res,"",input,target,0,0,0);
            return res;
        }
        static void printResult(ArrayList<String> res){
            for(int i=0;i<res.size();i++)
            System.out.println(res.get(i)+(" "));
            System.out.println();
        }

    }
    