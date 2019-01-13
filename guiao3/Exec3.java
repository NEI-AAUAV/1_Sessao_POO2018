/**
*
* AB - LEI - 2018
* Guiao3 - Exercicio 3
* Sessao de duvidas POO.
*
*/

public class Exec3 {

	public static void main(String[] args) {
        printCalendar(2015, 3, 7);
	}

    public static void printCalendar(int year, int month, int startingDay) {
		// Imprimir cabecalho
		System.out.println("-----------------------");
		System.out.println("| Mo Tu We Th Fr Sa Su|");
		System.out.println("-----------------------");

        // Numero de dias que o mes possui
		int num_days = (new int[] {0, 31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31})[month];

        // Aponta para o dia da semana durante o ciclo "for"
        int dayPnt = startingDay;
        StringBuilder calendar = new StringBuilder();

        // Guardar a primeira linha
        calendar.append("|");
        for (int i = 1; i < startingDay; i++)
            calendar.append("   ");
        
        // Guardar o resto do calendario
        for (int i = 1; i <= num_days; i++, dayPnt++) {
            // Adicionar o dia, caso o numero so tenha um digito
            // acrescentar um espaco antes do digito -> (i < 10) ? " "+i : i
            calendar.append(" "+((i < 10) ? " "+i : i));
            if (dayPnt == 7) {
                calendar.append("|\n|");
                dayPnt = 0;
            }
        }

        // Adicionar espacos na ultima linha
        for (int i = dayPnt; i <= 7; i++)
            calendar.append("   ");
        calendar.append("|");

        // Imprimir calendario
        System.out.println(calendar.toString());
		System.out.println("-----------------------");
    }

    // Metodo para verificar se o ano 'year' e bissexto
	public static boolean isLeapYear(int year) {
		if (year % 4 != 0) return false;
		if (year % 100 != 0) return true;
		if (year % 400 != 0) return false;
		return true;
	}
}
