import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sistema_de_relatorio_de_extensão {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        Map<Integer, String> map_one = new HashMap<>();
        
        map_one.put(1, "[ NATHAN ]");
        map_one.put(2, "[ EDUARDO ]");
        map_one.put(3, "[ ALVARES ]");
        map_one.put(4, "[ NICOLE ]");
        
        System.out.println(" VALIDAÇÃO DE DADOS ");
        
        System.out.print(" DIGITE O ID: ");
        int id_client = sc.nextInt();
        sc.nextLine();
        
        if(id_client == 1) {
        	System.out.println(" [ " + map_one.containsKey(1) + " ] ");
            System.out.println(" [ " + map_one.get(1) + " ] ");
        }
        if(id_client == 2) {
        	System.out.println(" [ " + map_one.containsKey(2) + " ] ");
            System.out.println(" [ " + map_one.get(2) + " ] ");
        }
        if(id_client == 3) {
        	System.out.println(" [ " + map_one.containsKey(3) + " ] ");
            System.out.println(" [ " + map_one.get(3) + " ] ");
        }
        if(id_client == 4) {
        	System.out.println(" [ " + map_one.containsKey(4) + " ] ");
            System.out.println(" [ " + map_one.get(4) + " ] ");
        }
        
        System.out.println(" ======================= ");
        System.out.println(" |     RELATORIO !     | ");
        System.out.println(" ======================= ");
        for(Map.Entry<Integer, String> pr : map_one.entrySet()) {
        	System.out.println(" [ " + pr.getKey() + " | " + pr.getValue() + " ] ");
        }
        
        Map<String, String> dados = new HashMap<>();
        
        dados.put("roberto_alfredo@gmail.com", "SCX45_089");
        dados.put("EDUZINHO@gmail.com", "TH054");
        dados.put("roberta_anaMei@gmail.com", "AMr0b3456");
        dados.put("melissinha78@gmail.com", "45M3L");
        
        System.out.println(" VALIDAÇÃO DE DADOS ");
        
        System.out.print("DIGITE UM EMAIL: ");
        String email = sc.nextLine();
        sc.nextLine();
        
        if(email.equals("roberto_alfredo@gmail.com")) {
        	System.out.println(dados.containsKey("roberto_alfredo@gmail.com"));
            System.out.println(dados.get("roberto_alfredo@gmail.com"));
        }
        if(email.equals("EDUZINHO@gmail.com")) {
        	System.out.println(dados.containsKey("EDUZINHO@gmail.com"));
            System.out.println(dados.get("EDUZINHO@gmail.com"));
        }
        if(email.equals("roberta_anaMei@gmail.com")) {
        	System.out.println(dados.containsKey("roberta_anaMei@gmail.com"));
            System.out.println(dados.get("roberta_anaMei@gmail.com"));
        }
        if(email.equals("melissinha78@gmail.com")) {
        	System.out.println(dados.containsKey("melissinha78@gmail.com"));
            System.out.println(dados.get("melissinha78@gmail.com"));
        } 
        
        System.out.println("============================");
        System.out.println("       RELATORIO FINAL      ");
        System.out.println("============================");
        for(Map.Entry<String, String> data : dados.entrySet()) {
        	System.out.println(" [ " + data.getKey() + " | " + data.getValue() + " ] ");
        }
        
        Map<Double, String> dados_financeiros = new HashMap<>();
        
        dados_financeiros.put(3400.78, "[ NATHAN ]");
        dados_financeiros.put(6342.58, "[ EDUARDO ]");
        dados_financeiros.put(4572.74, "[ ALVARES ]");
        dados_financeiros.put(3568.75, "[ NICOLE ]");
        
        System.out.println(" VALIDAÇÃO DE DADOS FINAL ");
        
        System.out.print("DIGITE O SALARIO MENSAL: ");
        double sal_mes = sc.nextDouble();
        sc.nextLine();
        
        if(sal_mes == 3400.78) {
        	System.out.println(dados_financeiros.containsKey(3400.78));
            System.out.println(dados_financeiros.get(3400.78));
        }
        if(sal_mes == 6342.58) {
        	System.out.println(dados_financeiros.containsKey(6342.58));
            System.out.println(dados_financeiros.get(6342.58));
        }
        if(sal_mes == 4572.74) {
        	System.out.println(dados_financeiros.containsKey(4572.74));
            System.out.println(dados_financeiros.get(4572.74));
        }
        if(sal_mes == 3568.75) {
        	System.out.println(dados_financeiros.containsKey(3568.75));
            System.out.println(dados_financeiros.get(3568.75));
        }
        
        
        System.out.println("===========================");
        System.out.println("      RELATORIO FINAL      ");
        System.out.println("===========================");
        for(Map.Entry<Double, String> center : dados_financeiros.entrySet()) {
        	System.out.println(" [ " + center.getKey() + " | " + center.getValue() + " ] ");
        }  

        System.out.println("============================");
        System.out.println("  RELATORIO DE VAL TOTAIS ! ");
        System.out.println("============================");

        System.out.println(" VALIDAÇÃO DE DADOS TOTAIS: ");
        System.out.println("[ | DADOS:  VAL1 |" + map_one.size() + " | ]");
        System.out.println("[ | DADOS:  VAL2 |" + dados.size() + " | ]");
        System.out.println("[ | DADOS:  VAL3 |" + dados_financeiros.size() + " | ]");
        for(Map.Entry<Integer, String> pr : map_one.entrySet()) {
        	System.out.println(" [ " + pr.getKey() + " | " + pr.getValue() + " ] ");
        }
        for(Map.Entry<String, String> data : dados.entrySet()) {
        	System.out.println(" [ " + data.getKey() + " | " + data.getValue() + " ] ");
        }
        for(Map.Entry<Double, String> center : dados_financeiros.entrySet()) {
        	System.out.println(" [ " + center.getKey() + " | " + center.getValue() + " ] ");
        }

    }    
}