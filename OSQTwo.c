#include <stdio.h>

int main(){

	pid_t pid;
	pid = fork();

	if(pid > 0){
		printf("Parent process with pid %d has created child process with pid %d and exiting\n", getpid(), pid);
	}
	else{
		printf("Child proces with pid %d sleeping", getpid());
		sleep(10);
		printf("Done sleeping");
		exit(0);
	}
	return 0;
}