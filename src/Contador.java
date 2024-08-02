import java.util.Scanner;

public class Contador
{
	public static void main(String[] args)
    {
		Scanner terminal = new Scanner(System.in);
		
		int parametroUm;
		do {
			System.out.println("Digite o primeiro parâmetro: ");

			while (!terminal.hasNextInt()) {
				System.out.println("O primeiro parâmetro deve ser um número. Digite novamente: ");
				terminal.next();
			}

			parametroUm = terminal.nextInt();
		} while (parametroUm <= 0);
		
		int parametroDois;
		do {
			System.out.println("Digite o segundo parâmetro: ");

			while (!terminal.hasNextInt()) {
				System.out.println("O segundo parâmetro deve ser um número. Digite novamente: ");
				terminal.next();
			}

			parametroDois = terminal.nextInt();
		} while (parametroDois <= 0);
		
		terminal.close();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException
	{
		if (parametroUm >= parametroDois) throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;

		for (int i = 1; i <= contagem; i++)
		{
			System.out.println("Imprimindo o número " + i);
		}
	}
}