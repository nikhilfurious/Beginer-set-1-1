#include<iostream>
#include<ctype.h>
using namespace std;
int main ()
{
    char ch;
    cin >> ch;
    if (isdigit(ch))
       cout << "\nThe entered character is a digit.";
    else if (isalpha(ch))
        {
            if ((ch == 'A') || (ch == 'E')|| (ch == 'I')|| (ch == 'O')|| (ch == 'U')|| (ch == 'a')|| (ch == 'e')|| 
            (ch == 'i')|| (ch == 'o')|| (ch == 'u'))
                cout << "\n Vowel";
            else
                cout << "\n Consonant";
        }
        else 
            cout << "\n invalid";
    return 0;
}
