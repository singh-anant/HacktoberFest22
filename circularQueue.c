// Name : Manish Kumar Gond
//  Reg.No : 791       Roll No : ECE/21131
#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *link;
} *front = NULL, *rear = NULL;

void cirqins(void);
int cirqdel(void);
void cirqdisplay(void);
int main()
{
    int x, item;
    do
    {
        printf("\n1.Insert an Element\n");
        printf("2.Delete an element\n");
        printf("3.Display the queue\n");
        printf("4.Exit from the program\n");
        printf("Enter you choice :\n");
        scanf("%d", &x);
        switch (x)
        {
        case 1:
            cirqins();
            break;
        case 2:
            item = cirqdel();
            if (item != -1)
                printf("The element %d is deleted from the queue\n", item);
            break;
        case 3:
            cirqdisplay();
            break;
        default:
            break;
        }
    } while (x <= 3);
}
void cirqins()
{
    int data;
    struct node *newp = malloc(sizeof(struct node));
    printf("Enter the data u wanna insert in queue : ");
    scanf("%d", &data);
    newp->data = data;
    newp->link = NULL;
    if (front == NULL && rear == NULL)
        front = rear = newp;
    else
    {
        rear->link = newp;
        rear = newp;
        newp->link = front;
    }
    printf("The element %d is inserted in the queue\n", rear->data);
}
int cirqdel()
{
    int data;
    if (front == NULL && rear == NULL)
    {
        printf("Queue Underflow");
        return -1;
    }
    data = front->data;
    struct node *temp = front;
    if (front == rear)
        front = rear = NULL;
    else
    {
        front = front->link;
        free(temp);
        temp = NULL;
        rear->link = front;
    }
    return data;
}
void cirqdisplay()
{
    struct node *temp = front;
    if (front == NULL)
    {
        printf("Queue Underflow");
        exit(1);
    }
    printf("The elements in queue are: \n");
    do
    {
        printf("%d ", temp->data);
        temp = temp->link;
    } while (temp != front);
    printf("\n");
}