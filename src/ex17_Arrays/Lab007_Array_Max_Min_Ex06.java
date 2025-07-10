package ex17_Arrays;

public class Lab007_Array_Max_Min_Ex06
{

    public static void main(String[] args)
    {

        int[] marks = {23, 25, 12, 29, 39, 11, 77, 80, 55, 66};

        int max_output = find_max(marks);
        System.out.println(max_output);

        int min_output = find_min(marks);
        System.out.println(min_output);

    }

    static int find_max(int[] marks)
    {
        int max = marks[0];
        for (int i = 0; i < marks.length; i++)
        {
            if (marks[i] > max)
            {
                max = marks[i];
            }
        }
        return max;
    }
        static int find_min (int[] marks)
        {
            int min = marks[0];
            for (int i = 0; i < marks.length; i++)
            {
                if (marks[i] < min)
                {
                    min = marks[i];
                }
            }
            return min;
        }
    }

