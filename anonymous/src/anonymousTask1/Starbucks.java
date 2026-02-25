package anonymousTask1;

public class Starbucks {
//	입점 시 상품을 등록
//	Form 인터페이스를 활용
	
	
//	오픈
//	역삼점
//	- 아메리카노, 녹차라떼, 애플민트티
//
//	신촌점
//	- 아메리카노, 자몽허니블랙티, 자몽에이드
//
//
//	1. 역삼점과 강남점은 아메리카노 무료행사 진행중
//	2. 사용자가 sell() 메뉴를 판매하면 역삼점과 강남점의 아메리카노는 무료행사 진행중을 출력
//	그 외 지점은 판매완료를 출력
	
	
	
	private String[] menus;
	
	public Starbucks() {;}
	public Starbucks(String[] menus) {
		this.menus = menus;
	}
	
	public String[] getMenus() {
		return menus;
	}
	public void setMenus(String[] menus) {
		this.menus = menus;
	}
	
	
	public void register(Form form) {
		this.setMenus(form.getMenus());
	}


	public void sell(String menu, Starbucks starbucks) {
		String[] menus = this.getMenus();
		boolean isSell = false;
		for(int i = 0; i < this.getMenus().length; i++) {
			if(menus[i].equals(menu)) {
				isSell = true;
//				starbucks -> 무료 행사 지점 아닌지
				
				
				if(starbucks instanceof EventMarker) {
					if(menu.equals("아메리카노")) {
						System.out.println("무료 행사 나눔중");
						break;
					}
				}
				System.out.println("판매 완료");
				break;
			}else {
				continue;
			}
		}
			if(!isSell) {
				System.out.println("판매 중 입니다...");
			
	}


	}}


	
	
