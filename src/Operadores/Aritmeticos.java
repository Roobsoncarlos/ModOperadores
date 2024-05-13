package Operadores;

public class Aritmeticos {


			public static void main(String args[]) {
				
				/* Aqui chamou os metodos criados para dentro do metodo Main, ou seja todos os metodos que nao forem inseridos aqui na Main
				 * eles nao serao executados, ao menos que a contrucao dos metodos nao sejam feitas de forma separadas este
				 */
				
				operacoesAtribuicoes();
				operacoesAritmeticas();
				operacoesIncrementoDecremento();
				operacoesRelacionais();
				operacoesLogicas();

			}
			
			
				private static void operacoesAtribuicoes() {
					
				//Print em destaque
					
				System.out.println("****Operadores de Atribuicao***");
				
				
				int numero1 = 10;
				
				int numero2 = 10;
				
				int numero3 = numero1 + numero2;
				
				System.out.println(numero3);
				
				numero3 += numero3;
				
				System.out.println(numero3);

			}

				public static void operacoesAritmeticas() {
					
				int num1 =10;
				
				int num2 = 20;
				
				int num3 = num1 + num2;
				
				int num4 = num1 - num2;
				
				int num5 = num1 / num2;
				
				int num6 = num1 * num2;
				
				int num7 = (10 + 10) / 2;
				
				//Print em destaque

				System.out.println("****Operador Aritmeticos****");
				
				System.out.println(num3);
				
				System.out.println(num4);
				
				System.out.println(num5);
				
				System.out.println(num6);
				
				System.out.println(num7);
		}
				public static void operacoesIncrementoDecremento() {
					
					//Print em destaque

					System.out.println("****Operadores Incremento e Decremento****");
					
					int num1 = 10;
					
					System.out.println(num1);

					num1++;
					
					System.out.println(num1);

					num1--;
					
					System.out.println(num1);
					
				}
				public static void operacoesRelacionais() {
					
					//Print em destaque
					
					System.out.println("****Operadores Relacionais****");
					
					int num1 = 10;
					
					int num2 = 10;
					
					int num3 = 50;
								
					
					//Obs os operadores relacionais normalmente utilizam tipo booleanos
					
					boolean isMaior = num1 > num2;
					
					System.out.println("is Maior: " + isMaior);

					boolean isDif = num3 != num2;
					
					System.out.println("is Dif: " + isDif);
					
					boolean isIgual = num1 == num2;
					
					System.out.println("is Igual: " + isIgual);
					
					boolean isMenorIgual = num1 <= num2;
					
					System.out.println("is Menor Igual: " + isMenorIgual);

					

				}
				public static void operacoesLogicas() {
					
					System.out.println("****Operadores Logicos****");
					
					int num1 = 10;
					int num2 = 20;
					
					 //condicao AND
					boolean isDentro_And = num1 >= 1 && num1 <=10;
					System.out.println("is Dentro And: " + isDentro_And);
					
					boolean isDentro_And2 = num2 >= 10 && num2 <=0;
					System.out.println("Is Dentro And 2: " + isDentro_And2);
				
					//condicao OR
					boolean isDentro_Or = num1 >=1 || num1 <=10; 
					System.out.println("Is Dentro Or: " + isDentro_Or);
					
					boolean isDentro_Or2 = num2 >=21 || num2 <=0;
					System.out.println("Is Dentro Or 2: " + isDentro_Or2);
					
					//condicao NOT
					boolean isNot = num1 >=1;
					System.out.println("Is Not: " + isNot);
					
					boolean isNot2 = num2 <=21;
					System.out.println("Is Not 2: " + !isNot2);
					
				}
}
