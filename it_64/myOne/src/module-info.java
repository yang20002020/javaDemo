import it_01.MyService;
import it_01.impl.itheima;
import it_01.impl.czxy;

module myOne {
    exports it_01;
   // provides MyService with itheima;
   provides MyService with czxy;
}