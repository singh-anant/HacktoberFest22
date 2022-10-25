#include <iostream>
using namespace std;

int returnReversed(int pNum)
{
    int tNum;
    while (pNum > 0) 
    {
        tNum = tNum * 10 + pNum % 10;
        pNum /= 10;
    }
    return tNum;
}

int main()
{
    int num;
    cin >> num;

    cout << returnReversed(num) << endl;
}