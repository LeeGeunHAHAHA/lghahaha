#include <stdio.h>
char str[1000002];
int main(void) {


	fgets(str, 1000002, stdin);
	int i = 0, count = 1;
	while (str[i] != '\0') {

		if (str[i] == ' ') { count += 1; if (str[i + 1] == '\n' || str[i + 1] == ' ')count--; }
		i++;
	}
	if (str[0] == '\n' || str[0] == ' ') { printf("%d", count - 1); }
	else if (str[0] == ' '&&str[1] == '\n')printf("%d", count - 1);
	else printf("%d", count);

	getchar();
	return 0;

}
