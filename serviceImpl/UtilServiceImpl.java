package serviceImpl;

import service.UtilService;

public class UtilServiceImpl implements UtilService {

    private static final UtilService instance = new UtilServiceImpl();

    private UtilServiceImpl(){}

    public static UtilService getInstance() {
        return instance;
    }

    @Override
    public int createRandomInteger(int start, int gap) {
        return (int)(Math.random() * gap) + start;
    }

    @Override
    public double createRandomDouble(int start, int gap) {
        return Math.random() * gap + start;
    }

    @Override
    public String createRandomName() {
        String[] names = {
                "이정재", "마동석", "송강호", "윤여정", "황정민",
                "정우성", "이병헌", "현 빈", "유해진", "손석구",
                "전도연", "손예진", "하지원", "김하늘", "송중기",
                "하정우", "장동건", "원 빈", "박해일", "소지섭", "김혜"};
        return names[createRandomInteger(0, names.length)];
    }

    @Override
    public String createRandomText() {
        String[] text = {"국회", "혼인과 가족생활", "국가의 정기화", 
                "대통령과 법률", "국무회의", "형사피해자", 
                "재판 권리", "소비자보호운동", "선거", "교육"};
        return text[createRandomInteger(0, text.length)];
    }

    @Override
    public String createRandomContent() {
        String[] content = {
                "대통령은 법률에서 구체적으로 범위를 정하여 위임받은 사항과 법률을 집행하기 위하여 필요한 사항에 관하여 대통령령을 발할 수 있다.",
                "국무회의는 대통령·국무총리와 15인 이상 30인 이하의 국무위원으로 구성한다.",
                "형사피해자는 법률이 정하는 바에 의하여 당해 사건의 재판절차에서 진술할 수 있다.",
                "교육의 자주성·전문성·정치적 중립성 및 대학의 자율성은 법률이 정하는 바에 의하여 보장된다.",
                "국가는 국민 모두의 생산 및 생활의 기반이 되는 국토의 효율적이고 균형있는 이용·개발과 보전을 위하여 법률이 정하는 바에 의하여 그에 관한 필요한 제한과 의무를 과할 수 있다.",
                "국가는 건전한 소비행위를 계도하고 생산품의 품질향상을 촉구하기 위한 소비자보호운동을 법률이 정하는 바에 의하여 보장한다.",
                "모든 국민은 헌법과 법률이 정한 법관에 의하여 법률에 의한 재판을 받을 권리를 가진다.",
                "국회는 국가의 예산안을 심의·확정한다. 환경권의 내용과 행사에 관하여는 법률로 정한다.",
                "국회의원의 선거구와 비례대표제 기타 선거에 관한 사항은 법률로 정한다.",
                "헌법개정안은 국회가 의결한 후 30일 이내에 국민투표에 붙여 국회의원선거권자 과반수의 투표와 투표자 과반수의 찬성을 얻어야 한다."
        };
        return content[createRandomInteger(0, content.length)];
    }

    @Override
    public String createRandomCompany() {
        String[] companies = {"Google", "엔비디아", "메타", "삼성", "LG", "Apple"};
        return companies[createRandomInteger(0, companies.length)];
    }
}
