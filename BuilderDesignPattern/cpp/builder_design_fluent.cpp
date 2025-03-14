#include<iostream>
#include<forward_list>
using namespace std;
class JSONBuilder
{
    forward_list<pair<string,string>> _string;
    forward_list<pair<string,char>> _char;
    forward_list<pair<string,unsigned char>> _uchar;
    forward_list<pair<string,int>> _int;
    forward_list<pair<string,unsigned int>> _uint;
    forward_list<pair<string,float>> _float;
    forward_list<pair<string,double>> _double;
    forward_list<pair<string,long double>> _longDouble;
    forward_list<pair<string,short int>> _short;
    forward_list<pair<string,long int>> _longInt;
    forward_list<pair<string,unsigned long int>> _ulongInt;
    forward_list<pair<string,long long int>> _longLongInt;
    forward_list<pair<string,unsigned long long int>> _ulongLongInt;
    public:
    JSONBuilder()
    {
    }
    JSONBuilder & add(string name,string data) {
        _string.push_front(pair<string,string>(name,data));
        return *this;
    }

    JSONBuilder & add(string name,char data) {
        _char.push_front(pair<string,char>(name,data));
        return *this;
    }

    JSONBuilder & add(string name,unsigned char data) {
        _uchar.push_front(pair<string,unsigned char>(name,data));
        return *this;
    }

    JSONBuilder & add(string name,int data) {
        _int.push_front(pair<string,int>(name,data));
        return *this;
    }

    JSONBuilder & add(string name,unsigned int data) {
        _uint.push_front(pair<string,unsigned int>(name,data));
        return *this;
    }

    JSONBuilder & add(string name,float data) {
        _float.push_front(pair<string,float>(name,data));
        return *this;
    }

    JSONBuilder & add(string name,double data) {
        _double.push_front(pair<string,double>(name,data));
        return *this;
    }

    JSONBuilder & add(string name,long double data) {
        _longDouble.push_front(pair<string,long double>(name,data));
        return *this;
    }

    JSONBuilder & add(string name,short int data) {
        _short.push_front(pair<string,short int>(name,data));
        return *this;
    }

    JSONBuilder & add(string name,long int data) {
        _longInt.push_front(pair<string,long int>(name,data));
        return *this;
    }
    JSONBuilder & add(string name,long long int data) {
        _longLongInt.push_front(pair<string,long long int>(name,data));
        return *this;
    }

    JSONBuilder & add(string name,unsigned long int data) {
        _ulongInt.push_front(pair<string,unsigned long int>(name,data));
        return *this;
    }

    JSONBuilder & add(string name,unsigned long long data) {
        _ulongLongInt.push_front(pair<string,unsigned long long int>(name,data));
        return *this;
    }

    string build()
    {
        string json = "{\r\n";
        int x=0;
        for(pair<string,string> elem: _string){
            if(x>0) json+=",\r\n";
            json+="\t\"";
            json+=elem.first;
            json+="\":\"";
            json+=elem.second;
            json+="\"";
            x++;
        }

        for(pair<string,char> elem: _char){
            if(x>0) json+=",\r\n",
            json+="\t\"";
            json+=elem.first;
            json+="\" : \"";
            json+=elem.second;
            json+="\"";
            x++;
        }

        for(pair<string,unsigned char> elem: _uchar){
            if(x>0) json+=",\r\n",
            json+="\t\"";for(pair<string,int> elem: _int){
            if(x>0) json+=",\r\n",
            json+="\t\"";
            json+=elem.first;
            json+="\" : ";
            json+=to_string(elem.second);
            x++;
        }
            json+=elem.first;
            json+="\" : \"";
            json+=elem.second;
            json+="\"";
            x++;
        }

        for(pair<string,int> elem: _int){
            if(x>0) json+=",\r\n",
            json+="\t\"";
            json+=elem.first;
            json+="\" : ";
            json+=to_string(elem.second);
            x++;
        }

        for(pair<string,unsigned int> elem: _uint){
            if(x>0) json+=",\r\n",
            json+="\t\"";
            json+=elem.first;
            json+="\" : ";
            json+=to_string(elem.second);
            x++;
        }

        for(pair<string,long int> elem: _longInt){
            if(x>0) json+=",\r\n",
            json+="\t\"";
            json+=elem.first;
            json+="\" : ";
            json+=to_string(elem.second);
            x++;
        }

        for(pair<string,unsigned long int> elem: _ulongInt){
            if(x>0) json+=",\r\n",
            json+="\t\"";
            json+=elem.first;
            json+="\" : ";
            json+=to_string(elem.second);
            x++;
        }

        for(pair<string,long long int> elem: _longLongInt){
            if(x>0) json+=",\r\n",
            json+="\t\"";
            json+=elem.first;
            json+="\" : ";
            json+=to_string(elem.second);
            x++;
        }

        for(pair<string,unsigned long long int> elem: _ulongLongInt){
            if(x>0) json+=",\r\n",
            json+="\t\"";
            json+=elem.first;
            json+="\" : ";
            json+=to_string(elem.second);
            x++;
        }

        json+="\r\n}";
        return json;
    }
};

int main() {
    JSONBuilder jsonBuilder;
    string json;
    jsonBuilder.add("string","Sameer").add("char",'2').add("int",122);
    json = jsonBuilder.build();
    cout<<json<<endl;
}