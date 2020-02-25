#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
int main()
{
		int n = 0;
		pid_t p;
		do
		{
			printf("enter number: \n");
			scanf("%d", &n);
		}
		while (n <= 0);
		p = fork();
		
		if(p == 0)
		{
				printf("fork successful...");
				while(n != 1)
				{
						if(n % 2 == 0)
						{
							n = n / 2;
						}
						else
						{
							n = (3 * n) + 1;
						}
						printf("%d, ", n);
				}
				printf("child process complete!");
		}
		else
		{
			printf("waiting on child process...\n");
		}
	
	return 0;
}
