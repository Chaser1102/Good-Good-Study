# -
DI和AOP是Spring的核心

DI是为了松耦合  
AOP是使各个部分各司其职，是对oop的补充，把应用的各个部分 分离开 然后把他作为一个切面切入切点 也就是要使用的部分  就像钉钉子一样订在需要的地方（不知道这样理解对不对）


@Autowired 自动装配  消除get set
@Service  业务逻辑类bean
@Repository  dao层bean


@Service用于标注业务层组件

@Controller用于标注控制层组件（如struts中的action）

@Repository用于标注数据访问组件，即DAO组件

@Component泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注
