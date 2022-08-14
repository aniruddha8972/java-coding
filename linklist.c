#include<stdio.h>
#include<stdlib.h>
typedef struct linklist
{
    int data;
    struct linklist*next;
}Linklist;

void linkedListTraversal(Linklist *P)
{
    while (P != NULL)
    {
        printf("Element: %d\n", P->data);
        P = P->next;
    }
}
// Linklist * insertAtFirst(Linklist *head, int data){
//     Linklist * ptr = (Linklist *) malloc(sizeof(Linklist));
    
//     ptr->data = data;

//     ptr->next = head;
//     return ptr;
// }
// struct linklist*insertAtIndex(struct linklist* head,int index,int element){
// struct linklist*ptr = (struct linklist*)malloc(sizeof(Linklist));
// struct linklist*p = head;
// int i = 0;

// while (i=index-1)
// {
//     p = p->next;
//     i++;
// }
// ptr->data = element;
// ptr->next = p->next;
// p->next = ptr;
// return head;
// }

Linklist*reverse(Linklist**head){
    Linklist*prev = (Linklist*)malloc(sizeof(Linklist));
    Linklist*current = (Linklist*)malloc(sizeof(Linklist));
    Linklist*Next = (Linklist*)malloc(sizeof(Linklist));
    prev = NULL;
    current = *head;
    Next = NULL;
    while (current != NULL)
    {
        Next = current->next;
        current->next = prev;
        prev = current;
        current = Next;
    }
     *head = prev;
    
   
}

Linklist*insertAtlast(struct linklist* head,int element){
    struct linklist*ptr = (Linklist*)malloc(sizeof(Linklist));
    struct linklist*p = head;
    while (p->next!=NULL)
    {
        p = p->next;
    }
    p->next = ptr;
    ptr->data = element;
    ptr->next = NULL;
    return head;
}
int findSize(Linklist*head)
{
    Linklist *ptr =(Linklist*)malloc(sizeof(Linklist));
    ptr = head;
    int size = 0; 
    while (ptr->next !=NULL)
    {
        
        ptr= ptr->next;
        size = size+1;
    }
return size;
}
// we have to delete the n th  node form the last of count.......
// the n th node form first onwards is size - n +1 and before node of n is size -n..... 
Linklist*deleteNode(Linklist*head,int size,int n)
{
    Linklist *ptr =(Linklist*)malloc(sizeof(Linklist));
    ptr = head;
    int i = 0;
while (i != size-n+1)
{
    ptr = ptr->next;
    i++;
}
// printf("%d\n",ptr->data);
Linklist *p =(Linklist*)malloc(sizeof(Linklist));
p = head;
int j = 0;
while (j != size-n)
{
    p = p->next;
    j++;
}
// printf("%d\n",p->data);
 p->next = ptr ->next;
    return head;


} 
Linklist*middleElement(Linklist*Head,int findSize){
    Linklist*Ptr = (Linklist*)malloc(sizeof(Linklist));
    Ptr = Head;
   
    if (findSize%2 == 0)
    {
      for (int i = 0; i <((findSize+1)/2); i++)
    {
        Ptr =  Ptr->next;
    }    
    }
    else{
        for (int i = 0; i <((findSize/2)+1); i++)
    {
        Ptr = Ptr->next;
    }
    }
    printf("%d",Ptr->data);
    
}

int main()
{
    Linklist*A = (Linklist*)malloc(sizeof(Linklist));
    Linklist*B = (Linklist*)malloc(sizeof(Linklist));
    Linklist*C = (Linklist*)malloc(sizeof(Linklist));
   
   A->data = 10;
   A->next = B;

   B->data =11;
   B ->next = C;

   C->data = 12;
    C->next = NULL;
    // linkedListTraversal(A);

   insertAtlast(A, 9);
   insertAtlast(A, 13);
//    insertAtlast(A,19);
    // linkedListTraversal(A);
    // insertAtIndex(A,2,44);
    linkedListTraversal(A);
    // reverse(&A);
    // printf("\n");
    // linkedListTraversal(A);
    int size = findSize(A);
   printf("%d\n",size);
//    deleteNode(A,size,3);
//    linkedListTraversal(A);
   middleElement(A,size);

}
//
//