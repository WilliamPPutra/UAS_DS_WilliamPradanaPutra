public class binarySearch {

        static int binary(String[] arr, String x)
        {
            int l = 0, r = arr.length - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;

                int res = x.compareTo(arr[m]);

                if (res == 0)
                    return m;

                if (res > 0)
                    l = m + 1;

                else
                    r = m - 1;
            }

            return -1;
        }

        public static void main(String []args)
        {
            String[] arr = { "william", "clapton", "taylor", "billie"};
            String x = "clapton";
            int result = binary(arr, x);

            if (result == -1)
                System.out.println("Data tidak ditemukan");
            else
                System.out.println("Data ditemukan pada "
                        + "index ke " + result);
        }
}

