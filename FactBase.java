package test;

import java.util.ArrayList;

public class FactBase {
	/*void AddToChain(String) � ��������� � ������ ������ � ������������� ������� ��� �����.
List<String> GetChain() � ���������� ������� ������.
int GetChainSize() � ���������� ���������� ��������� � �������.
void ResetChain() � ���������� ������ � �������� ��� � ���������� ���������.
*/
    private static ArrayList<String> Chain = new ArrayList<String>();
    private static int chainSize = 0;

    public static void AddToChain(String s)
    {
        Chain.add(s);
        chainSize++;
    }

    public static void ResetChain()
    {
        Chain.clear();
        chainSize = 0;
    }

    public static ArrayList<String> GetChain()
    {
        return Chain;
    } 

    public static int GetChainSize()
    {
        return chainSize;
    }


}
