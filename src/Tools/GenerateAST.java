package Tools;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class GenerateAST {
    public static void main(String[] args) throws IOException {

        String outputDir = "../BigCompiler";
        defineAST(outputDir, "Expr", Arrays.asList(
                "Binary   : Expr left, Token operator, Expr right",
                "Grouping : Expr expression",
                "Literal  : Object value",
                "Unary    : Token operator, Expr right"
        ));
    }

    public static void defineAST(String dir, String fname, List<String> types) throws IOException{
        String path=dir+"/"+fname+".java";
        PrintWriter pw=new PrintWriter(path, StandardCharsets.UTF_8);
        pw.println("package lox;");
        pw.println("import java.util.List;");
        pw.println("abstract class "+ fname+"{" );
        for(String type:types){
            String className=type.split(":")[0].trim();
            String fields=type.split(":")[1].trim();
            defineType(pw, fname, className, fields);
        }
        pw.println("}");
        pw.close();


    }

    public static void defineType(PrintWriter pw, String fname, String className, String fields){
        pw.println(" static class "+ className+" extends "+ fname+"{");
        pw.println("    "+className+"("+fields+") {");
        String[] sField=fields.split(", ");
        for(String field: sField){
            String name=field.split(" ")[1];
            pw.println("    this."+name+" = "+name+";");
        }
        pw.println("}");
        pw.println();
        for(String field:sField){
            pw.println("    final "+ field+";");

        }
        pw.println("}");
    }
}
