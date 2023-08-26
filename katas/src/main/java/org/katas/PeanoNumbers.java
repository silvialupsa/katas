package org.katas;
/**
 * !!MENTION!!
 * You can't use the following characters:
 * + - * / % > <
 *
 * please delete this comment when submit
 */
public final class PeanoNumbers {
    interface Peano {
        final class Zero implements Peano {
            static Zero INSTANCE = new Zero();

            private Zero() {
            }

            public int getNr() {
                return 0;
            }
        }

        final class Succ implements Peano {
            public final Peano peano;

            Succ(Peano peano) {
                this.peano = peano;
            }

            public int getNr() {
                int counter = 1;
                Peano defaultPeano = this.peano;
                while (defaultPeano instanceof Succ) {
                    defaultPeano = ((Succ) defaultPeano).peano;
                    counter++;
                }

                return counter;
            }
        }

    }

    enum Ordering {GT, LT, EQ}

    static Peano add(Peano a, Peano b) {
        if (b instanceof Peano.Zero) {
            return a;
        }
        for (int i = 0; i < ((Peano.Succ) b).getNr(); i++) {
            a = new Peano.Succ(a);
        }
        return a;
    }

    static Peano sub(Peano a, Peano b) {
        try {
            if (b instanceof Peano.Zero) {
                return a;
            }
            int aNumber = ((Peano.Succ) a).getNr();
            int bNumber = ((Peano.Succ) b).getNr();
            int diff = aNumber - bNumber;
            if (diff < 0) {
                throw new ArithmeticException("negative number");
            }
            Peano result = new Peano.Zero();
            for (int i = 0; i < diff; i++) {
                result = new Peano.Succ(result);
            }
            return result;
        } catch (ClassCastException e) {
            throw new ArithmeticException("negative number");
        }
    }

    static Peano mul(Peano a, Peano b) {
        try {
            if (b instanceof Peano.Zero || a instanceof Peano.Zero) {
                return new Peano.Zero();
            }
            Peano c = new Peano.Zero();
            int aNumber = ((Peano.Succ) a).getNr();
            int bNumber = ((Peano.Succ) b).getNr();
            for (int i = 0; i < bNumber; i++) {
                c = add(c, a);
            }
            return c;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Invalid input: " + e.getMessage());
        }
    }

    static Peano div(Peano a, Peano b) {
        try {
            if (b instanceof Peano.Zero) {
                throw new ArithmeticException("divide by 0");
            }
            if (a instanceof Peano.Zero) {
                return new Peano.Zero();
            }
            int aNumber = ((Peano.Succ) a).getNr();
            int bNumber = ((Peano.Succ) b).getNr();
            int div = aNumber / bNumber;
            Peano result = new Peano.Zero();
            for (int i = 0; i < div; i++) {
                result = new Peano.Succ(result);
            }
            return result;
        } catch (ClassCastException e) {
            throw new ArithmeticException("divide by 0");
        }
    }

    static boolean even(Peano peano) {
        if (peano instanceof Peano.Zero) {
            return true;
        }
        Peano div = div(peano, new Peano.Succ(new Peano.Succ(Peano.Zero.INSTANCE)));
        Peano multiply = mul(div, new Peano.Succ(new Peano.Succ(Peano.Zero.INSTANCE)));
        return ((Peano.Succ) peano).getNr() == ((Peano.Succ) multiply).getNr();
    }

    static boolean odd(Peano peano) {
        return !even(peano);
    }


    static Ordering compare(Peano a, Peano b) {
        try {
            if (b instanceof Peano.Zero && a instanceof Peano.Zero) {
                return Ordering.EQ;
            } else if (b instanceof Peano.Zero) {
                return Ordering.GT;
            } else if (a instanceof Peano.Zero) {
                return Ordering.LT;
            }
            int aNumber = ((Peano.Succ) a).getNr();
            int bNumber = ((Peano.Succ) b).getNr();
            if (aNumber < bNumber) {
                return Ordering.LT;
            } else if (aNumber > bNumber) {
                return Ordering.GT;
            }
            return Ordering.EQ;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Invalid input: " + e.getMessage());
        }
    }
}
