#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    if(a[0]<a[i])
    {
      a[0]=a[i];
    }
  }
  std::cout<<a[0];
  return 0;
}