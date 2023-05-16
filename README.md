Baseline 모델 개발이 필요한 경우

Stage 단위  모델/추론코드 개발&운영 프로세스

본 구축 이전에 수행되는 PoC와 구분되며 본구축 프로젝트에서 요건에 따라 신규 모델 작업, 모델 수정이 발생할 경우 Baseline 모델개발자와 모델 개발자가 협업하여 진행하며 필요 시에만 PoC 모델 개발 Stage 수행된다.

PoC 모델 개발
본구축 이전에 수행되는 PoC와 구분되며 적합한 기본 모델을 확보하기 위해 기술 검토 시 신규 모델 개발이 필요한 경우나 모델 수정이 필요한 경우 Baseline 모델 개발자와 협업하여 진행하는 Stage이다. 기본 모델이 확보된 경우는 PoC 모델 개발 단계를 생략할 수 있다.

모델/추론코드 운영
구분	Stage	설명	주요 산출물
모델/추론코드 개발	
비즈니스 정의:비즈니스 정의 단계는 프로젝트 범위와 목표를 수립하여 AI를 적용한 비즈니스를 정의하는데 목적이 있다. 이를 위해 비즈니스 정의 단계는 AI 모델/추론 코드 개발을 수행하기 위해 고객이 요구하는 바를 요구사항으로 정의하고 목표 수준을 사용자승인기준으로 정의하여 구체적인 범위와 목표를 정의한다. 고객의 요구사항과 달성하고자 하는 목표를 바탕으로 AI기술을 검토하고 추진계획을 수립한다.
요구사항 정의서
분석 계획서
PoC 모델 개발:	본구축 이전에 수행되는 PoC와 구분되며 적합한 기본 모델을 확보하기 위해 기술 검토 시 신규 모델 개발이 필요한 경우나 모델 수정이 필요한 경우 Baseline 모델 개발자와 협업하여 진행하는 Stage이다. 기본 모델이 확보된 경우는 PoC 모델 개발 단계를 생략할 수 있다.	PoC모델
Prototyping:	Prototype은 본격적으로 대형 모델을 학습하기 전에, 기본 모델을 기반으로 현장 환경의 적합성을 확인하는 Prototyping 하는 단계이다.	
데이터 수집 및 검토:	데이터 수집 및 검토 단계는 AI 모델 개발 목적에 적합한 데이터를 획득하고 라벨링하고 데이터와 라벨을 검토하여 데이터를 준비하는 단계이다. 반복학습을 수행하면서 추가 데이터를 획득하고 라벨링 작업이 고도화 된다.	라벨링 데이터셋
데이터 분석 및 모델개발:	모델의 성능을 요구 조건까지 끌어올리기 위한 실험을 설계하고, 모델 학습에 적합한 데이터로 처리하고 모델 개발 및 하이퍼파라미터 튜닝을 진행하여 모델 개발 코드를 확보하여 다음 Stage인 학습 및 검증 단계에 필요한 Input을 확보하는 단계이다. 여러 Iteration 반복을 통해 목표하는 모델 개발 코들를 확보하고 데이터 보완이 필요하면 데이터 수집 및 검토 Stage를 수행한다. 	
 (평가지표설계서,모델 개발 코드)
학습 및 검증 :	학습을 진행하고 학습된 모델을 기준으로 검증 데이터를 통해 모델의 성능을 평가하여 검증 데이터에 대한 모델의 성능이 요구 조건을 달성하는지 확인한다. 데이터 보완이나 모델 개선이 필요하면 데이터 수집 및 검토 Stage 혹은 데이터 분석 및 모델개발 Stage를 다시 수행한다.	검증 결과
평가 및 확정 :최종 목표를 달성하는 모델을 확보하기 위해 모델의 성능을 평가하고 최종 목표를 달성했을 경우 모델을 확정한다. 모델 성능을 달성하지 못 하였을 경우 학습 및 검증, 데이터 분석 및 모델개발, 데이터 수집 및 검토 Stage를 다시 수행한다.
 (모델 실험 결과서,확정 모델 패키지(N차 고도화 모델))
추론 개발: 	효율적인 추론을 위해 필요한 모델 경량화, 최적화, 추론 Workflow를 수행하고 추론 모델 환경을 고려하여 추론 코드를 개발하고 추론 테스트를 수행하여 서빙을 위한 추론 패키징을 수행한다.	배포 모델 패키지
통합 테스트 및 배포:	SW1.0과의 통합이 이루어지며 추론 서비스를 위한 시스템 간의 인터페이스를 테스트 하여 상호 정확한 커뮤니케이션을 수행할 수 있는지 검증하고 사용자 승인 테스트를 통과하면 배포를 수행한다.	운영 배포 with SW1.0

모델/추론코드 운영	
추론	:운영 추론 환경에서 운영 데이터에 대한 추론을 수행하고 추론 수행한 입력 데이터, 추론 결과, 모델 결과 설명을 수집한다. 수집된 운영 데이터는 재학습 등에 활용할 수 있다.
모니터링	:안정적이고 추론 서비스와 장애 대응을 위해 모델 검증 기준에 따라 추론한 결과에 대한 수작업 모델 검증 작업을 수행하거나 자동으로 탐지하여 모델 성능과 데이터 모니터링을 수행하며 서비스, 인프라 모니터링도 같이 수행한다.	
재학습 Trigger	재학습 수행 판단을 위해 재학습 기준에 따라 재학습 요건이 발생하면 재학습을 해야 할지 유지해야 할지 판단을 수행한다.	
데이터 수집 및 검토	재학습에 적합한 데이터 준비를 위해 데이터 수집 및 검토를 수행한다. 재학습을 위한 신규 데이터의 획득은 추론서비스 시 운영 데이터 수집을 통해 가능하며 재학습에 적절한 데이터셋 구성이 필요하다.	
재학습 설계	성능 저하 원인을 분석하고 성능 저하 원인에 따라 재학습 계획을 수립하고 모델 성능 개선을 위해 평가지표 조정한다. 성능 저하 원인 유형에 따라 데이터 라벨 재정의, 데이터 전처리 변경, 데이터셋 재구성 등을 수행하거나 신규 학습/검증 데이터를 이용하여 현재 운영 배포된 모델 구조로 모델 학습을 수행하거나 모델 구조를 변경하여 학습/검증을 수행할 수 있다. 재학습 설계 단계는 성능 개선 사항을 파악하여 적절한 재학습을 수행하는 것을 목적으로 한다.	
데이터 분석 및 모델개발	모델의 성능을 요구 조건까지 끌어올리기 위한 실험을 설계하고, 모델 학습에 적합한 데이터로 처리하고 모델 개발 및 하이퍼파라미터 튜닝을 진행하여 모델 개발 코드를 확보하여 다음 Stage인 학습 및 검증 단계에 필요한 Input을 확보하는 단계이다. 여러 Iteration 반복을 통해 목표하는 모델 개발 코들를 확보하고 데이터 보완이 필요하면 데이터 수집 및 검토 Stage를 수행한다. 	
학습 및 검증	학습을 진행하고 학습된 모델을 기준으로 검증 데이터를 통해 모델의 성능을 평가하여 검증 데이터에 대한 모델의 성능이 요구 조건을 달성하는지 확인한다. 데이터 보완이나 모델 개선이 필요하면 데이터 수집 및 검토 Stage 혹은 데이터 분석 및 모델개발 Stage를 다시 수행한다.	
평가 및 확정	최종 목표를 달성하는 모델을 확보하기 위해 모델의 성능을 평가하며 재학습 시 모델 평가는 기본적으로 다음 4가지 비교를 포함하여 수행하며 최종 목표를 달성했을 경우 모델을 확정한다.
1. 현재 운영 배포된 학습 모델 + 배포 전 Test Data
2. 현재 운영 배포된 학습 모델 + 신규 Test Data
3. 신규 학습 모델 + 배포 전 Test Data
4. 신규 학습 모델 + 신규 Test Data
추론 개발	효율적인 추론을 위해 필요한 모델 경량화, 최적화, 추론 Workflow를 수행하고 추론 모델 환경을 고려하여 추론 코드를 개발하고 테스트를 수행하여 서빙을 위한 추론 패키징을 수행한다.	
통합 테스트 및 배포	SW1.0과의 통합이 이루어지며 추론 서비스를 위한 시스템 간의 인터페이스를 테스트 하여 상호 정확한 커뮤니케이션을 수행할 수 있는지 검증하고 사용자 승인 테스트를 통과하면 배포를 수행한다.


<<devmlops>>
 ML : 데이터를 수집하를 이를 기반으로 AI 모델을 학습하고 확정짓는 단계이다.
Dev : 확보된 AI 모델을 기반으로 한 AI SW를 개발하고 패키징하는 단계이다.
Ops : 패키징된 AI SW를 실 운영에 반영하여 모니터링을 하는 단계이다.
여기서 눈여겨 봐야할 사항은 뫼비우스 띄처럼 3개의 단계가 표현되어 있다는 점이다. 

이는 각 단계는 지속적인 학습 (CT: Continuous Training) , 제공 및 배포 (CD : Continuous Delivery/Deployment) 지속적인 통합 ( CI: Continuous Integration ) 이 이루어 진다는 의미이며
각 단계 내에서도 지속적인 Feedback Loop를 통해 고도화 된다는 의미이다.
 
 LGCNS의 DevMLops 파이프라인은 아래와 같은 특징을 가진다.
1) 개발/스테이징 (Developement/Staging) 영역과 운영(Preprouction/Production)에 적용될 파이프라인을 분리 하여 정의 하였다.
 2개의 영역의 수행하는 기능 측면에서는 유사하나, 파이프라인의 목적이 서로 상이함에 따라 분리 하였다.
개발 파이프라인 (개발/스테이징)의 목적 : AI SW의 전반적인 개발을 위한 목적
운영 파이프라인 (운영) 의 목적 : AI SW의 기반이 되는 AI 모델의 유지보수를 위한 목적
데이터 보안 이슈로 인하여 프로젝트 특성상 운영환경에서만 데이터 활용이 가능한 경우가 존재 함에 따라 분리하였다.
AI SW의 기반이 되는 AI모델을 학습하고 확보하기 위해서는 데이터가 필수적이다.
해당 데이터를 개발/스테이징 영역으로 이관이 어려울 경우를 대비하여 분리하였다.
개발 파이프라인 : Sample 데이터를 통한 AI SW 개발
운영 파이프라인 : AI 모델의 고도화 및 AI 모델의 유지보수 진행
2) 다양한 데이터 특성을 반영한 MLops 파이프 라인 정의
AI SW의 기반이 되는 AI 모델과 더불어 AI 모델 적용한 AI SW는 수행하는 기능에 따라 여러가지 형태의 데이터가 존재한다.
시각 AI의 경우 이미지/ 동영상
언어AI의 경우 문서 /음성
데이터AI의 경우 정형 데이터
복합 AI의 경우 위 3가지 유형의 데이터가 조합되는 경우도 있다.
이와 같은 다양한 형태의 데이터를 처리가능한 기능을 MLops 파이프라인에 추가하였다.
3) 각 파이프라인이 공통된 CI/CD 체계 내에서 동작하도록 구성
MLops 파이프 라인은 크게 최소 3가지의 공통 관리 요소를 포함해야한다.
데이터 통합 관리
개발 Source Code 관리 (AI 모델 개발 , AI 서비스 개발)
AI 모델 통합 관리
4) 파이프라인이 관리하는 Repository 정의
Repository	설명	
 개발/스테이징  영역
(Developement/Staging)
운영 영역
(Preprouction/Production)
비고
데이터 통합 관리	
AI 모델 학습 및 평가를 위한 데이터 Repository
개발 / 스테이징 영역 Cover	-	운영데이터 Repository에서 이관
운영 데이터 Repository	-	운영 영역만 Cover	
모델 개발 소스/추론 소스 통합 관리	AI 모델 개발 Source Code Repository	개발 영역 Cover	AI 모델 형태로 존재	
AI 서비스 개발 Source Code Repository	개발 / Staging 영역 Cover	패키지 형태로 존재	
AI 모델 통합 관리
확정된 AI 모델 통합관리	
개발/ 스테이징 / 운영 영역을 모두 Cover함
(각 영역별 모델 상태 (Status) 변화관리)
 ===========================
 2.2 DevMLops 파이프라인 기능 정의

본 설계서에는 앞에서 제시한 DevMLops의 파이프라인을 구성하는 상세한 기능에 대해서 설명하고자 한다.
"2.1 DevMLops 파이프라인 정의"에서 언급한 파이프라인 Flow 구성요소의 기능 뿐만 아니라 관리해야 하는 기능들까지 포함하여 설명하고자 한다.
2.2.1 DevMLOps 기능 범위
본 설계서에서는 DevMLOps의 파이프라인 구성을 위해서는 아래와 같이 크게 6개 영역에 대한 기능들이 필수적으로 요구된다.
DevMLops를 구성하는 영역은  데이터 수집 및 검토  /  데이터 분석 및 모델 개발  /  학습 및 검증, 평가 및 확정 / 추론 개발 /  통합 테스트 및 배포 /  추론 /  모니터링 /  관리 영역이다. 
2.2.2 DevMLOps 상세 기능 정의
2.2.2.1 데이터 수집 및 전처리 
 기능	기능 정의
데이터 수집	
기존 SW1.0 영역의 레거시 시스템에서 AI 모델 학습을 위한 원본 데이터 및 데이터셋 수집을 위한 기능이 제공 되어야 한다
빅데이터에서 진행한 데이터 수집과 동일한 패턴으로 적용된다
데이터 라벨링	[시각 특화]이미지 라벨링	
시각 영역에 특화된 기능이며 목적(classification, detection, segmentation)에 따른 라벨링을 지원하는 기능이 제공되어야 한다.

[언어 특화]텍스트 라벨링	
언어 영역에 특화된 기능이며 텍스트 데이터에 대한 classfication, tagging등의 라벨링을 지원하는 기능이 제공되어야 한다.
데이터 관리

영역별 데이터 관리	
시각, 언어, 데이터 영역별로 데이터를 관리하는 기능이 제공되어야 한다.
시각 AI : 이미지, 동영상 등의 데이터를 관리하는 기능
언어 AI : 텍스트, 단어사전 관리하는 기능
데이터 AI : Table 데이터셋 관리하는 기능 
데이터 차수 관리	
데이터 취득되는 시점 이나 취득 양상의 변화를 반영한 데이터 관리를 위해 데이터 차수 관리 기능이 요구된다.
데이터 묶음 관리	
취득된 데이터들의 다양한 조합을 통한 AI 모델 학습을 위해 데이터 묶음을 생성하고 관리 하는 기능이 요구된다. 
데이터 버전 관리	
AI 모델을 학습할 데이터가 확정 되었다면 이를 버전관리 하는 기능이 요구된다.
위에서 언급한 차수 및 묶음 데이터를 기반으로 버전관리가 이루어 지는 것을 권장한다.
해당 데이터 버전은 AI 모델 학습(실험) 시에 같이 관리 되어지도록 권장한다.
데이터 현황 관리	
데이터의 라벨링 현황 등을 시각화하여 보여주는 기능이 요구된다.
데이터 검토	
데이터 수집 및 라벨링 , 버전관리 기능을 활용함에 있어 데이터의 이상 유무를 판단할 수 있는 데이터 검토 기능이 요구된다.
2.2.2.2 데이터 분석 및 모델 개발
기능	기능 정의
데이터 분석	[데이터 특화]데이터 시각화/
Feature Engineering	
데이터 AI 영역에서 AI 모델 학습을 위한 데이터를 분석하는 기능으로서 데이터의 특성을 시각화하고 주어진 데이터를 모델의 문제를 잘 표현할 수 있는 features로 변형 시키는 Feature Engineering 기능이 요구된다.
학습/추론 데이터 전처리	
AI 모델 학습 시 데이터 관점에서 고려해야 하는 사항들을 파악할 수 있고 학습에 활용할 수 있는 형태로 데이터 전처리를 수행할 수 있는 기능이 요구된다.
실험 환경 설정

기본 기능	
학습에 사용되는 입력 (데이터셋, 파라미터값) 및 출력(학습의 결과물인 모델과 지표)을 하나의 실험환경 단위로 관리 할 수 있게 설정하는 기능
[시각/언어 공통]Augumentation	
데이터 특성을 반영하여 데이터를 변형 또는 가공하여 데이터의 양을 늘리기 위한 기능
[시각/언어 공통]데이터 Split 	
데이터를 특성을 반영하여 학습/검증/테스트로 나누는 기능
Split 데이터 관리	
AI 모델 학습시 활용되는 데이터와 검증 및 테스트를 위한 데이터를 확인하고 관리 하는 기능
학습 코드 생성	
AI 모델 학습 소스 개발 시 공통으로 사용되는 AI 표준 프레임워크 활용하여 학습 가능한 코드를 개발하는 기능
학습 코드 관리	
확정된 AI 모델 학습 코드를 관리하는 기능이 요구되며, 이를 바탕으로 대량 데이터 기반 자동 학습 및  재학습 등이 가능하도록 한다.
개발 workflow	
각 컴포넌트들을 연결 시킬 수 있는 기능(ex. 전처리→학습→후처리)
각종 컴포넌트 관리	
모델 학습 시 연결될 수 있는 컴포넌트의 등록 및 관리  (ex. 전처리, 학습, 후처리)


2.2.2.3 학습 및 검증 / 평가 및 확정

기능	기능 정의
학습/ 재학습	
준비된 데이터는 기반으로 AI 모델을 학습하는 기능
특정 Trigger를 통해 AI 모델을 재학습 하는 기능
하이퍼 파라미터 최적화	
모델 학습 시 모델 소스 내에서 사용되는 하이퍼 파라미터의 값을 자동으로 최적화 하도록 제공하는 기능
학습 결과 관리	
AI 모델이 학습(실험) 결과를 관리 및 표출 하는 기능
사용한 데이터 셋, Hyperparamter, 평가 지표(Metric)에 대한 성능치 등
평가 지표 관리	
학습(실험)의  평가 지표 등록 및 관리 하기 위한 기능
학습 모델 평가	
기존 학습(실험) 및 신규 학습(실험)을 평가 할 수 있는 기능
모델 평가 결과 시각화
여러 실험 간의 모델 결과 비교
모델 확정	
여러 학습(실험)중 배포 할 모델로 확정 할 수 있는 기능
모델 버전 관리	
여러 학습(실험)중 확정된 모델의 버전 관리, 배포 모델 버전 관리를 하기 위한 기능
모델 현황 관리	
모델 목록 및 버전 시각화하여 확인 할 수 있는 기능
분산 환경 설정	
분산 학습을 수행할 수 있도록 환경을 제공하는 기능
 2.2.2.4 추론 개발/ 통합 테스트 및 배포
기능	기능 정의
모델 최적화/경량화	
모델의 성능을 확보하기 위하여 모델을 최적화 하고 경량화 하는 기능
추론 workflow	
여러 모델을 조합하여 하나의 추론을 구성하도록 흐름 정의하는 기능
추론 테스트 (Evaluation Test)	
AI서비스 + AI 모델을 통합적으로 평가하는 기능
추론 패키징	
AI모델 과 AI 서비스를 모델 서버에서 인식하는 모델 형태로 패키징 (ex. 서빙 프레임워크인 triton inference server에서 취급하는 모델 형태로 패키징) 하는 기능
추론 패키지 관리	
추론 소스 및 환경이 포함된 컨테이너를 관리 하는 기능
추론 환경 관리	
AI 서비스 + AI 모델이 동작 가능한 환경을 관리하는 기능
배포	
패키징된 AI SW를 운영으로 배포하는 기능
배포 모델 버전 관리	
추론서비스(운영)에 배포된 모델 버전 관리 기능
배포 관리( 승인/취소 )	
AI SW 배포하도록 승인하는 기능 
배포 된 AI SW를 이번 버전으로 롤백 할 수 있는 기능
2.2.2.5 추론
기능	기능 정의
운영 데이터 관리	
운영에서 발생한 실 데이터를 수집 및 관리 하는 기능
추론 결과 수집	
추론 결과 및 로그 파일을 수집 하는 기능
추론 결과 관리	
추론 결과 및 로그 파일을  관리 하는 기능
추론 결과 현황 관리	
추론 결과를 시각화 하여 확인 할 수 있는 기능
실시간/비동기/배치추론	
추론 서비스를 각 유형별로 제공 하는 기능
실시간 추론 : 실시간으로 동기 추론이 가능하도록 api 제공
비동기 추론 : 추론 요청시 비동기로 추론이 수행 가능하도록 api 제공
배치 추론 : 대량의 데이터를 배치성으로 추론 수행 하도록 api 제공
 2.2.2.6 모니터링
기능	기능 정의
모델 성능 모니터링	
운영 중인 모델의 성능을 모니터링 할 수 있는 기능
모니터링 알람 관리	
운영 중인 모델의 성능이 기준치에서 벗어날 경우 운영자에게 알람을 주는 기능
모니터링 현황 관리	
시스템 모니터링을 포함한 통합 모니터링을 보여주고 관리하는 기능
재학습 지표 관리	
재학습이 필요하다고 판단하는 기준 지표 등록 및 관리
운영 Infra 모니터링	
AI SW가 운영되는 환경 및 자원에 대한 모니터링 기능
데이터 모니터링	
AI SW가 처리하는 데이터의 변화를 감지하는 기능
 2.2.2.7 관리
기능	기능 정의
프로젝트 관리	
분석 과제 생성 및 관리
태스크 관리	
영역(시각, 언어) 별 수행 태스크 관리
태스크별 산출물 관리	
각 태스크별 산출물 업로드 및 관리
개발 환경 관리 	
개발 환경의 자원(cpu, gpu), 개발환경으로 사용할 컨테이너 지정
개발 환경 설정 관리	
개발 환경에서 사용하는 파라미터 및 참조 파일 경로 등을 지정
추론 환경 관리	
추론 환경의 자원(cpu, gpu), 개발환경으로 사용할 컨테이너 지정
추론 환경 설정 관리	
추론 환경에서 사용하는 파라미터 및 참조 파일 경로 등을 지정
각종 코드 관리	
학습 및 추론 코드, 기타 전/후처리 코드 등의 관리
권한 관리	
시스템 메뉴의 권한 관리
배포 권한 관리
사용자/조직 관리	
시스템 사용자 및 조직 관리
게시판 관리	
프로젝트 내에서 사용되는 게시판 관리
 
 2.3.1 관리 대상의 Overview
AI SW를 만드는 과정인 DevMLops 파이프라인에서는 데이터 / AI 모델 / Source Code 3개 대상에 대해서 관리가 되어야 한다
대상	설명 및 고려 사항
데이터	
운영단계에 취득 가능한 것으로 AI 모델 개발 단계에서 가공 및 관리되어진다
AI 모델	
AI SW의 모든 단계에서 관리되어지며, 개발/Stage/운영 환경에서 접근 및 관리되어진다
소스 코드	AI 학습 코드	
AI 학습을 위한 코드로 모델 개발 시 사용된다. 민감데이터 이슈로 인하여 개발 환경에서 학습이 제한될 경우, 개발된 학습 Code를 AI서비스 운영에서 학습 가능하도록 고려해야한다.
추론 코드	
AI 모델을 추론하기 위하여 추론 개발 시 사용된다. 추론 개발 환경에서 관리되며, 이를 패키징하여 Stage 및 운영에 배포되도록 구성해야 한다
 
2.3.2 관리 대상의 상태 변경 및 적용 환경
관리 대상은 AI SW 라이프사이클에 따라 상태가 변경 되며, 변경된 상태에 따라 운영되는 환경이 변경된다. 이에 대한 상세한 내용을 정의하였다
DevMLOps에서는 관리 대상이 상태가 변경됨에 따라 관리해야 하는 항목과 방식이 달라져야 하며, 이를 반영하는 파이프라인이 구축되어야 한다. 
 
2.4 DevMLops 파이프라인 기능별 솔루션 라인업
2.4.1 DevMLOps S/W 구성도
DevMLOps의 기능을 제공하기 위하여 영역별로 활용할 수 있는 S/W 종류는 데이터수집, 데이터 관리, 데이터 레이블링, 실험환경, 하이퍼 파라미터 최적화, 서빙 프레임워크, 워크플로우, 추론 결과 및 현황관리(로그 기록 및 관리)등이 있다 .
각 S/W에서 다루는 DevMLOps 기능 범위는 하기와 같다.
 
 2.4.2 DevMLOps 오픈소스 S/W 라인업
DevMLOps의 기능을 제공하기 위하여 오픈소스를 활용하는 방안이 있다.

영역별 S/W 종류별로 하기와 같은 오픈소스들이 있고 본 설계서에서는 기능 비교를 통해 가장 적합한 오픈소스를 선정하였다.
 
 =======================
 3.1 DevMLops 파이프라인 프로세스

3.1.1 개요
DevMLOps가 가져야 하는 기능과 관리 대상을 기반으로 하여 Code Based SW와 연관된 AI SW 개발 및 배포에 따른 파이프라인을 구축하여 정의하였다.
이는 AI Platform이 가져야 하는 이상적인 프로세스이다.
각 프로세스는 개발 프로세스에서 제시된 스테이지 단위로 정의하였다
 3.1.2 데이터 수집 및 검토/데이터 분석 프로세스
 프로젝트관리->태스크관리->이미지관리(이미지로드/이미지차수처리/이미지묶음처리/라벨링/detection/segmentation)
                        ,텍스트관리(...,                                 /텍스트태깅) 
                        ,단어사전관리(...,                                /사전버전관리)
 ->처리방식->개발환경설정관리->데이터EDA시각화->데이터 Feature Engineering->데이터split
 ->데이터전처리->데이터버전관리->데이터시각화

3.1.3 모델개발/학습, 검증/평가, 확정 프로세스
평가지표관리->개발환경설정관리->모델개발->컴포넌트관리->개발workflow->모델정적검증->분산환경설정->하이퍼파라미터최적화->작업 스케줄링->학습결과저장
 ->학습결과시각화->학습결과비교->모델확정->모델버전관리
3.1.4추론관리/추론서비스/통합테스트 및 배포
 추론개발->추론환경설정->모델최적화->모델경량화->추론workflow->모델패키징->모델배포->추론빌드->코드정적검증->추론패키징->추론배포(개발)->추론검증
 ->모델/추론 스테이징배포->sw 1.0빌드->테스트자동화->배포ready->모델배포승인->모델배포(->배포대상)->추론배포승인->추론배포
 ->모니터링->모니터링 시각화
 3.1.5 재학습/모니터링
모니터링->재학습대상선정->재학습대상데이터선정->데이터로드->데이터수집/전처리->학습(모델결과저장)->학습및검증->재학습모델비교
 ->추론관리/통합테스트/배포
 3.2.1 데이터수집
 3.2.2 데이터 관리
1. 개요
데이터 관리는 학습에 사용되는 데이터를 체계적으로 관리하기 위한 기능이다.

학습하고자 하는 데이터의  구성 선택 및 조합을 하여 학습시 활용 하기 위한 기능을 제공 해야 하고, 학습 시 활용된 데이터를 추적할 수 있도록 버전 관리 기능이 제공 되어야 한다.

이는 향후 모델에 대한 재현 요청 시 재현 가능한 데이터를 관리해야 하는 것을 목표로 한다

수집된 원본데이터 혹은 라벨링된 데이터의 버전 및 차수 묶음을 관리
특정 데이터 버전이 추후 모델 학습에 이용된 이력을 확인 할 수 있도록 추적/매핑에 용이한 형태로 버전 관리 
2. 기능
학습에 사용되는 데이터는 모델 개발자가 운영에서 발생한 데이터 혹은 미리 준비된 데이터에서 선별적으로 데이터를 구성하여 학습에 활용할 수 있어야 한다. 

데이터 차수 관리

학습 데이터는 한번에 데이터가 업로드 될 수도 있지만 보통의 경우 여러번에 나눠서 업로드가 된다. 
동일 학습에 사용되는 데이터는 데이터 업로드 차수 별로 차수 관리가 필요하다.
데이터 차수 관리의 대상은 원본 데이터와 라벨링 된 데이터이고 언어영역의 경우 사전 데이터도 해당된다
데이터 묶음 관리	
여러번 차수로 나누어 데이터가 업로드 된 경우 각 차수 내의 데이터를 섞어서 하나의 데이터 묶음으로 정의하고 이를 학습 데이터로 활용하는 기능을 제공한다.
새로 구성된 데이터 묶음도 하나의 차수로 관리 된다.
데이터 묶음 관리의 대상은 원본 데이터와 라벨링 된 데이터이고 언어 영역의 경우 사전 데이터도 해당된다.
데이터 버전 관리	
데이터의 형상을 복원할 수 있도록 데이터 버전 관리 기능을 제공한다.
데이터 관리에 사용되는 S/W에 따라서 버전관리와 차수관리가 동일할 수 있다.
데이터 버전 관리의 원본 데이터와 라벨링 된 데이터이고 언어영역의 경우 사전 데이터도 해당된다.
3. 상세 내용
 3.1 데이터 상태(Status)
AI SW의 관점에서 데이터는  4가지 상태(staus)를 가진다.
각 데이터 status는 원천 데이터 ->  정제 데이터 → 라벨링 데이터 → Split 데이터 순으로 변경된다.
staus가 변화됨에 따라 정제 혹은 가공이 발생되며, 각 status 내에서도 수량 변경 혹은 내용 변경 등의 변화 요소가 존재한다.
이에 따라 status의 변화에 대한 이력 관리가 필요하며, 각 status내에서의 변화 관리가 필요하다.
원천 데이터	
데이터 source로 부터 획득된 데이터

(실제 운영데이터에서 획득된 데이터임)

수량 변경

획득 날짜별 대한 데이터 (운영시)
획득 차수별 데이터 (모델 학습을 위한 별도 확보 데이터)
빈번함 
정제 데이터

ML/DL 모델 개발을 위한 형태로 변화된 데이터

(Outlier 제거, 전처리등을 수행한 data)

수량 변경/ 내용 변경	
데이터 수량의 변경 (일부 데이터의 제거)
새로운 데이터로 변경
적음
라벨링 데이터	
모델 개발시 정답지에 대한 데이터

(ex Classificaition의 경우 폴더 구조 혹은 추가 Label 정보 데이터 추가)

라벨 변경

파일 변경
위치 변경
라벨 추가
Classification : 폴더상의 위치 변경 (위치 변경)
Segmetnation: label 이미지가 변경 (파일 변경)
Detection : label 정보 데이터가 변경 (파일 변경)
적음
(라벨의 변화는 크지 않음)
Split 데이터	ML/DL 모델 개발 단계에서 모델 실험을 위해 필요로 되는 데이터	Split 비율 변경/ Split seed 변경	
Train/val/test set 의 수량 변경 (총 수량은 동일)
Train/val/test set 의 파일 구성 변경 (총 수량은 동일)
빈번함 (실험 구성에 따라 비번할 가능성이 있음)

K-fold등..

3.2 데이터 관리 요소
AI SW의 구성 요소 중 하나인 AI 모델은 데이터를 기반으로 학습이 이루어짐에 따라 아래의 특성을 반영한 데이터 관리가 요구된다.
          1) 학습 데이터 확장을 고려한 데이터 관리
               - AI 모델 고도화 및 재학습 과정에서는 모델 성능이 개선을 위한 데이터 확장이 필연적으로 요구된다.
               - 이에 여러 시점 및 특성에 따른 데이터 차수 관리가 요구된다.
               - 또한 여러 차수의 데이터를 혼합 및 재구성 하여 활용하기 위한 데이터 묶음 관리가 요구된다.

          2) AI 모델 재현 및 History 파악을 고려한 데이터 관리   
              - AI 모델이 학습된 이후에는 어떠한 데이터로 학습된 모델인지 AI 모델로는 확인이 불가능한 특성을 가지고 있다.
              - 이에 학습된 AI 모델의 History 파악을 위한 데이터 버전 관리가 요구된다. 
              - AI 모델은 데이터에 따라 얻어지는 AI 모델의 결과가 달라지는 특성을 가지고 있다.
              - 이에 AI 모델의 재현 학습을 위해서 데이터 형상 관리가 요구된다.

Status	관리 요소

차수 관리	묶음 관리	버전 관리	형상 관리
원천 데이터	O	O	

정제 데이터  

△	△	O	O
라벨링 데이터	△	△	O	O
Split 데이터	△	△	△	O
원천데이터 
원천 데이터의 주요 변화 요소는 차수 변화이기에 차수 관리가 요구된다.
또한 각 차수 별 묶음 처리를 위한 묶음 관리가 요구된다.
정제 데이터 
해당 데이터의 원천데이터 중 일부 데이터가 filtering 되거나, 형태가 변화되는 변화 요소가 발생한다.
이에 따라 변경이 발생되는 시점마다의 버전관리가 요구되며, 이를 복원하기 윈한 형상 관리가 요구된다.
다만, 원천데이터로부터 관리되는 차수/묶음 관리에 dependency를 가지도록 버전 관리, 형상 관리가 되어야 한다.
라벨링 데이터 
라벨링 데이터의 주요 변화 요소는 라벨링 변화 이다.
이에 따라 변경이 발생되는 시점마다의 버전 관리가 요구되며, 이를 복원하기 위한 형상 관리가 요구된다.
다만, 원천 데이터의 차수/묶음 관리 및 정제 데이터 / Feature engineered 데이터의 버전 관리와의 dependency가 반영 되어야 한다.
Split 데이터
학습 데이터의 주요 변화 요소는 위의 변화 요소와는 다르게 특정 데이터 셋을 나누는 (Split) 변화이고, 다양한 학습(실험) 과정에서만 활용된다.
반복 적인 학습(실험)을 진행하여 소수의 AI 모델만 확정 짓고 배포되어진다. 
이에 따라 각 학습(실험)은 라벨링 데이터의 버전에 dependency를 가지고 재현이 가능하도록 형상 관리만 가능하도록 하는 것을 추천한다.
버전에 대한 규칙이나 체계는 실제 프로젝트 규칙에 따라 접근할 수 있다.
 
 3.2.3 데이터 라벨링
1.개요
데이터 라벨링이란 이미지, 영상, 텍스트 등의 데이터에 사람이 데이터 가공 도구를 활용하여 인공지능이 학습할 수 있도록 다양한 정보를 목적에 맞게 입력하는 것을 의미한다.

데이터 라벨링은 언어/시각/데이터 영역에서 각기 모델의 목적 및 종류에 따라 가공 형태가 다르다.
 언어	
classification
- 라벨 클래스 정의
- 문서 및 텍스트를 하나 혹은 여러 개의 카테고리로 분류
Named Entity
- 미리 정의해 둔 사람, 회사, 장소, 시간, 단위 등에 해당하는 단어(개체명)를 문서에서 인식하여 추출 분류
Question Answering
- 문맥에 기반하여 답변을 문서 내에서 인식하여 추출
시각	
classification
- 라벨 클래스 정의
- 이미지를 하나 혹은 여러개의 카테고리로 분류
detection
- 이미지 내에서 객체 감지
segmentation
- 이미지를 여러 세그먼트로 분할
데이터	
classification
- 시계열 데이터를 카테고리로 분류
 
 
 3.3.1 모델 개발(학습) 관리

1. 개요
모델 개발(학습)관리는 모델 개발(학습)시 생성되는 실험 환경에 대한 관리, 학습 환경 및 소스 관리를 포함한다.

모델 학습시 사용되는 요소와 모델 학습 결과 지표 등에 대해 통합적으로 관리하는 실험환경 관리. 모델 학습 시 사용된 환경에 대한 설정 정보, 모델 학습 소스 관리가 이루어져
향후 모델에 대한 재현 요청 시 재현 가능한 실험/학습 환경을 관리하는 하는 것을 목표로 한다

학습 시 생성되는 실험 환경에 대한 관리 및 재학습 시 재활용 할 수 있도록 실험 환경의 버전 관리
모델 학습 시 사용된 환경에 대한 설정(ex. 설치된 라이브러리 리스트)에 대한 정보가 관리
모델 학습 소스의 형상 관리
2. 기능
실험 환경 관리, 학습 환경 관리, 학습 소스 관리에는 다음과 같은 기능이 제공되어 재현 요청 시 실험/학습 환경을 재현하는데 활용 할 수 있어야 한다.

실험환경 관리

실험환경 관리란 모델 학습시 사용되는 요소(소스 위치, 데이터셋 위치, 하이퍼파라미터, 참조 및 설정 파일)와 모델 학습 결과 지표 등에 대해 통합적으로 관리하는 기능이다.

실험환경을 생성하고 삭제할 수 있어야 한다.
실행 파라미터 설정 기능이 제공되어 각 실행에 파라미터의 값을 설정하여 실험 환경 관리 시스템에서 각 실행에 대한 파라미터 값을 확인 할 수 있어야 한다.
실행 지표 설정 기능이 제공되어 각 실행의 결과 값인 지표값을 설정하여 실험 환경 관리 시스템에서 각 실행에 대한 지표값을 확인 할 수 있어야 한다.
모델 생성 기능이 제공되어 각 실행에서 생성되는 구분하여 모델을 저장할 수  있어야 한다.
하나의 실험환경에서 여러 실행을 만들어 실행 간 학습 조건 및 결과 비교를 할 수 있는 기능을 제공한다.
동일 목적의 실험(실행)들에 대해서 통합적으로 학습 조건 및 결과 비교가 된다.
두개 이상의 여러 실험(실행)간의 학습 조건 및 결과 비교가 한번에 수행되고 시각화 하여 보여준다.
학습 시 기본적으로 머신러닝/딥러닝 프레임워크에서 제공하는 로그 기능을 활용할 수 있도록 지원한다.

 학습 환경 관리	
모델 학습 시 사용된 환경에 대한 설정(ex. 설치된 라이브러리 리스트)에 대한 정보가 관리 되어야 한다.

 학습 소스 관리	
모델 학습 소스의 형상 관리가 되어야 한다.

 
 3. 상세 내용
 3.1 모델 개발 소스 상태(Status)
AI SW를 완성시키는데 기반이 되는 Source Code는 모델 개발 소스, 추론 소스 Code 크게 2가지이며, 이를 통해 최종 AI SW를 얻을 수 있다.
모델 개발 소스는 목적에 따라 개발/ 확정/ 적용 상태(status)가 요구된다.
3.2 AI 학습 Code 관리 요소
AI SW 및 Source Code의 경우 SW1.0 기반의 관리가 요구되나, 다른점으로는 AI 모델을 얻기 위한 모델 개발 소스에 대한 관리가 추가된다는 점이다.
SW1.0과 동일하게 개발/확정 상태가 존재하나, AI 모델 학습을 수행하는 적용 상태(Status)가 존재한다.
이를 고려한 상태(status) 관리가 요구되며, 확정된 이후에 일반적으로 버전관리/형상 관리가 요구된다.

 
 3.3.2 모델 관리
1. 개요
모델 관리는 학습된 모델, 배포 대상 모델, 배포되어 운영 중인 모델의 버전 관리 및 추적성을 제공하는 기능을 포함한다.

모델 생성 시 사용된 데이터, 소스, 학습 조건 및 모델 성능 지표 등을 추적할 수 있도록 기능을 제공 해야 한다.

2. 기능
모델 관리 기능은 모델 저장 기능, 모델 버전 관리 기능, 모델 다운로드 기능, 모델 추적 기능, 모델 배포 기능 등이 있다.

모델 저장

모델 학습 시 코드상에서 학습된 모델을 관리하는 영역으로 학습된 모델을 저장할 수 있는 기능을 제공해야 한다.
학습된 모델에 대해서 모델  Registry로 등록하여 체계적인 버전 관리가 되도록 기능 제공 되어야 한다.
모델 버전 관리	
모델 저장소에 등록된 모델에 대해서 버전 및 상태(staging, production)관리를 제공한다.
동일 목적의 모델에 대해서 하나의 모델 체계로 관리 되도록 관리하는 기능이다.
모델 다운로드	
모델 저장소에 등록된 모델에 대해 모델의 이름과 버전 등의 정보를 통해 모델을 다운로드하여 사용할 수 있도록 제공하는 기능이다.
모델 추적	
모델 생성에 사용된 데이터, 학습 파라미터, 학습 코드 등의 정보를 추적할 수 있는 기능이다.
모델의 결과 지표를 추적하는 기능도 포함된다.
모델 배포	
 추론 서비스를 개발하는 단계에서 적용할 확정된 AI 모델을 배포하는 기능이 제공되어야 하며 배포 전 소스 정적 검증을 수행하여 정적 검증을 통한 AI 학습 Code 품질을 확보한다.
3. 상세 내용
 3.1 AI 모델 상태(Status)
AI SW 관점에서 AI 모델은 활용 관점에 따라서 아래와 같이 학습(실험) 모델 / 개발 배포 모델 / 배포 모델 / 유휴 모델 4가지 상태(status)로 구분된다.
각 상태(status) 변화는 모델 패키징 작업 및 배포 작업이 발생될 때 변화된다.
이에 Devmlops의 Phase 변화에 따른 AI 모델에 대한 상태(status)를 구별해야 하며 상태(status)변화 기록의 추적 및 이력 관리가 필요하다.
학습 모델

AI 모델을 학습 하는 단계로서 해당 단계에서는 다양한 실험(dataset 변화, Hyperparameter 튜닝등) 중인 모델
실험 중인 모델 중 추론 코드 개발 단계에 적용하기 위한 모델을 확정하면 개발 배포 모델로 상태가 변경됨
모델 개발 환경 
( 모델 개발 / 학습 및 검증 Phase)

모델 개발 환경 
(평가 및 확정 Phase)

개발 배포 모델

추론 서비스를 개발하는 단계에서 적용할 확정된 AI 모델
모델의 변화보다는 AI 모델의 input/ output값을 기반으로 비즈니스 Scene에 맞도록  AI 서비스를 개발하는데 활용
AI 서비스와 함께 패키징 되어 운영에 배포될 때 배포 모델로 상태가 변경된
추론 개발 환경
(추론 개발 Phase)

AI 서비스 운영 환경
(통합 테스트 및 배포 Phase)

운영 배포 모델	
AI SW에 포함되어 운영에 적용 되는 모델
AI 서비스 운영 환경
(통합 테스트 및 배포 Phase)


유휴 모델	
확정된 모델 / 배포 모델 중 더 이상 사용하지 않는 모델
각 신규 개발 배포 모델 / 배포 모델이 생성될 경우 기존 모델의 상태(status)가 변경됨
모델 개발 환경  / AI 서비스 개발 환경 / AI 서비스 운영 환경	
3.2 AI모델 관리 요소
AI SW의 구성 요소 중 하나인 AI 모델 학습 특성 및  활용 방안을 고려한 관리 방안이 요구된다.
1) AI 모델의 반복적이고 빈번한 학습 특성 

AI 모델은 데이터와 hyperparameter 튜닝 등의 작업을 수행하여 반복적이고 빈번한 학습이 발생한다.
이에 따라 AI 모델 history 파악을 위한  학습(실험)기록 관리 및 형상 관리가 요구된다.
2) 학습된 AI 모델의 다양한 사용 목적

여러 학습(실험)을 통해 얻어진 다양한 AI 모델 중 AI 서비스에 적용할 모델을 선택하는 과정이 필수적이다.
위의 AI 모델이 확정된 이후에는 모델의 변화가 발생되지 않고 활용만 되며 AI 서비스 개발 지원 목적, AI SW를 통한 운영 반영 목적 등의 이유로 사용되어진다.
이에 따라 학습(실험) 모델 이후의 모델 상태(Status)는 공통적으로 관리될 필요가 있기에 상태(status) 관리가 요구된다.
또한 확정된 AI 모델들의 구분을 위한 버전 관리가 요구된다.
버전 관리 시 추가적으로 모델 이력 확인 및 재현을 위한 학습(실험)모델의 형상관리와의 dependecy있게 설게 되어야 한다.

 
 3.4.1 모델 추론 기능 및 배포 모델 관리
 
1. 개요
모델 추론 기능 및 배포 모델 관리는 추론 서비스를 구성하기 위한 추론 서버의 소스에 대한 관리 및 추론 환경을 포함한 추론 패키지의 관리, 모델 서버 관리, Code Based SW를 통합하여 테스트 한 후 품질을 보증한 배포를 포함한다.

모델 패키지, 추론 패키지 및 추론 모듈의 배포 프로세스 이해를 돕기 위해  하기와 같이 추론 AP와 모델 서버로 구성되어졌다는 전제 하에 모델 추론 기능 및 배포 모델 관리에 대한 내용을 정리하고자 한다

추론 AP
추론의 요청을 받아 모델 서버에 요청을 전달하고 모델서버의 결과 값을 가공하여 추론의 결과값으로 반환하는 웹 서버(REST API 서버) 이다.
모델 서버
모델을 하나의 서비스 형태로 운영할 수 있는 서버이다.
여러 모델들을 하나의 모델 서버에서 체계를 가지고 운영할 수 있도록 해준다.






2. 기능
모델 추론 기능 및 배포 모델 관리는 추론 AP의  소스 코드 형상 관리, 추론 환경 관리, 추론 패키지 관리, 추론 workflow관리, 모델 서버 관리의 기능이 있다.

추론 AP를 구성하는 소스 코드의 형상 관리, 소스 코드 및 추론 환경이 반영된 추론 패키지(컨테이너 이미지)의 형상 관리, 배포된 모델 패키지를 구동 시킬 수 있는 모델 서버의 관리가 필요하다.

추론 AP 소스 코드 형상 관리	
추론 AP 소스 코드의 형상을 관리해야 한다.
추론 환경 관리	
컨테이너 환경, cpu/gpu 자원등의 설정을 관리하는 기능을 제공 해야 한다
추론 패키지 관리	
추론 소스 및 환경이 반영된 컨테이너 이미지의 형상 및 버전 관리가 되어야 한다
모델 최적화/모델 경량화	
학습에서 패키징된 모델에 대하여 추론을 위한 최적화 및 경량화를 지원하는 기능이 제공되어야 한다
추론 workflow 관리	
추론 모델을 조합하여 하나의 추론 서비스를 제공 하는 기능을 제공해야 한다.
모델 서버의 관리	
모델이 배포 되었을 때 이를 운영할 수 있는 모델 서버에 대한 관리가 되어야 한다.
모델 서버는 모델을 하나의 서비스로 제공하는 서버로 모델명과 모델의 입력값을 requeust 형식으로 전송하였을 때 response로 모델의 출력 값을 반환하게 해주는 서빙 프레임워크이다.
서빙 프레임워크는 운영될 모델을 저장하는 모델 저장소(repository)가 존재하고 각 모델의 설정 값들이 관리 된다.
추론 AP 소스 배포 관리	
개발된 추론 소스 배포 시 소스에 대한 테스트 자동 기능 및 소스 정적 분석 기능이 연계되어야 한다
. 정적 검증 : 추론 코드, AI 서비스를 사용하는 application 인터페이스 점검
기업 정책에 따라 승인 프로세스를 적용할 수 있는 기능이 있어야 한다
추론 소스 배포 시 모델 배포와 동시성을 가지고 진행할 수 있는 방안이 간구되어야 한다
3. 상세 내용
3.1 추론 소스 상태(Status)
AI 서비스 Code는 목적에 따라 개발/확정 상태(status)가 요구된다.
대상	상태(Status)


목적	모델 개발 환경	추론 개발 환경	AI 서비스 운영
모델 개발

학습 및 검증

평가 및 확정

추론 개발

운영 배포

모니터링

추론 소스

개발	AI 모델을 활용한 AI서비스 Code를 개발하는 단계이다.	


O	

확정	해당 Code에 이슈가 없음을 검증하여 Code 품질을 보장한 상태이다	


O	

추론/모델 패키징(운영)	배포	확정된 추론 코드와 AI 모델을 패키징 한 상태이다.	



O	
적용	패키징된 AI SW를 운영에 적용한 상태이다.	




O
3.2 추론 소스 코드 관리 요소

추론 소스는 SW1.0 과 같은 내용으로 SW1.0에 준하는 관리 체계와 기능이 필요하다.다른 점이 있다면 학습되어 패키징된 모델을 호출하는 기능이 추가된다.

         1) 추론 소스
              - SW1.0과 동일하게 개발/확정 상태가 존재하며 확정된 이후 버전 관리/형상 관리가 요구된다.
              - 여러 학습(실험)을 통해 얻어진 다양한 AI 모델 중 AI 서비스에 적용할 모델을 선택하는 과정이 필수적이다
         2) 추론 패키지 
              - 기존 SW1.0과 상이하게 AI 학습 Code의 산출물로 나온 AI 모델과 확정된 추론 코드를 패키징하는 작업이 요구된다.
              - 패키징을 수행하는 배포 상태와 운영에 반영된 적용 상태가 존재하며 이를 관리하기 위한 상태(status) 관리 가 요구된다.
              - 운영에 반영된 이후 버전 관리 / 형상 관리가 요구된다.

대상	상태(Status)	관리 요소

상태 (Status) 관리	버전 관리	형상관리
추론 코드

개발	O



확정	O	O
추론/모델 패키징(운영)	배포	O	

적용	O	O
3.3 추론/모델 배포 프로세스
추론 배포 시 SW1.0과의 통합 테스트 및 코드 품질을 위한 정적 분석 도구를 활용한 자동 파이프라인을 정의해야 한다
1) 자체 추론 코드 배포 시 코드코드 정적 분석 도구 연결
2) 추론 코드를 호출하는 Application(sw1.0)과의 빌드 연계 테스트 자동화 

3.5.1 운영 및 모니터링 관리

1. 개요
모니터링은 DevMLOps의 프로세스가 정상적으로 동작하는지 실시간/주기적으로 점검하고 관련하여 시스템 자원 현황도 조회할 수 있는 기능이며
안정적이고 신뢰할 수 있는 AI 서비스 제공을 목적으로 한다.
모니터링의 관리 방안은 크게 프로세스 모니터링과 시스템 모니터링 기능으로 나뉜다.
2. 기능
프로세스 모니터링에는 학습/추론의 상태를 확인 할 수 있는 기능이 제공되어야 하며 모델의 성능을 확인하고 성능 조건에 미달할 경우 알람을 발생 시키는 기능을 제공한다. 

기능	설명
프로세스 모니터링	
학습 모니터링

학습 상태 및 결과를 조회할 수 있는 기능을 제공 해야 한다.
학습 상태 모니터링 : 학습 진행 상태(학습 시작/학습 진행중/학습종료) 별로 조회할 수 있는 기능을 제공한다.
학습 결과 모니터링 : 학습 별로 결과 지표를 조회할 수 있는 기능을 제공한다.
추론 모니터링	
추론 서비스의 상태 및 조회할 수 있고 추론 결과 현황을 조회할 수 있어야 한다. 
추론 서비스 상태 모니터링(정상/무응답) : 추론 AP와 모델 서버의 구동 상태를 조회할 수 있는 기능을 제공한다.
추론 결과 현황 모니터링 : 운영에서 발생되는 추론의 개별/통합적 현황 조회 기능이 제공 되어야 한다. 
모델 모니터링	
운영중인 모델의 성능에 대해 실시간/주기적으로 확인 할 수 있어야 한다. 
모델 성능 모니터링 : 모델 성능 저하를 감지 할 수 있도록 성능 조회 기능이 제공되어야 한다. 
재학습 대상 모니터링 : 재학습 지표 및 재학습 기준에 따라 재학습 대상을 조회할 수 있는 기능이 제공되어야 한다.
시스템 모니터링	
CPU/GPU/메모리 자원 각각에 대한 사용량을 확인 할 수 있도록 조회 기능을 제공 한다. 
.....====
 
 
 fdd
 기법특징
 .비즈니스 업무기능을 바탕으로 업무가 수행되기위한 시스템기능을 연결하여 서비스도출하는 기법
 .비즈니스업무중심의기능분해도와해당비즈니스를 지원하는 시스템기능을 연결하는 업무기능 분해도를 작성 한 후 이를 이용하여 후보 서비스를 도출하는 방식
 장점
 .기존시스템 전체를 반영하여 msa를 적용할 경우 범위누락없는 서비스 및 api도출가능
 .현업참여가 적극적일수없는 환경이거나, 현업의 요구사항이 구체적이지 못할경우 안정저긍로 구축할 수 있는 방법
 .대규모의 인원이 빅뱅으로 프로젝트 수행시 general한표준에 의해 진행할수있는 방안
 단점
 .현장의 목소리 반영이 부족할수있음
 .프로세스변경이 어려움
 .비즈니스업무기능 분해가 아닌 시스템기능분해도로만 정의될경우 비즈니스목적을 반영하지못한서비스도출로 연결될수있음
 event스토밍
 기법특징
 .eventstorming을통한 서비스 도출
 .업무전문가(현업/sm)들이 도출한 event를 categorized하여 후보서비스를 도출
 장점
 .분석/설계에 대한 특별한 지식없이 참여가능
 .common language,common understanding 을가짐
 .특정인에게 책임을 과중하게 요구되지 안흥ㅁ(모두의책임)
 .드러나지 않은 현업의 real voide가 pain point로 도출.반영될 수 있음
 .신규 비즈니스 혹은 프로세스의 변화에 용이
 단점
 .미참여인원에대해서결과에 대한 설득이 어려움
 .asis기능대비 100%커버여부를 판단하기 힘듬
 .전문가 참석이 어려운 경우 효과를 볼 수 업음
 
 Business Agility : 업무변경량, 추가/변경 csr건수 , 확장가능성  , 현업인터뷰
 장애대응 : 트랜잭션발생량,
 서비스독립성 : 역공학 호출관계, crud,
 배포 용이성 : 현행시스템 기준 측정
 요구사항 요청 조직 독립성 : 헌업인터뷰
 운영조직독립성:시스템운영자 인터뷰
 
 
 솔루션 aa특징
 비즈니스 
 .각회사마다 업무프로세스를 설정할수있도록 구성
 .화면의 on/off방식으로 사용여부 관리
 .비즈니스 프로세스를 설정으로 처리하는 방식 설계
 화면
 .화면 항목을 항목설정으로 과닐할수있도록 설계
 기능설계
 .각회사마다 기능을 사용하거나 사용하지 않도록 하는 환경설정
 로직설계
 .각회사에 특화된 로직없이 처리할수있는구조로 설계
 .비즈니스룰형식으로처리
 .특화로직을 처리하는 모듈로 구성
 데이터모델
 .일반화한 모델로구성
 .특화된 항목은 사용자 정의 속성으로 구성하여 설정으로 처리할수있도록 함
 데이터값
 .회사마다 다른 데이터 값을 정의할수있는 체계구축해야함
 ---------------------
 권한정보=call 권한정보.권한조회(사용자정보.사용자id,액션);  : 권한정보를 attribute로 관리할 것이 아니라 역할별로 관리할 수 있도록 수정해야한다.
 i주문정보.주문상태코드'0000, : 각회사마다 상태의 의미를 관리할 수 있는 비즈니스룰관리를 해야하고, 회사마다 승인에대한 코드를 유연하게 관리할수있어야한다.
 주문정보.주문상태코드 != '0001'
 회사마다 다른 상품가격계산 : 각 회사마다 상품가격을 계산할수있는 비즈니스룰을 과닐하거나 계산을 회사별로 다르게 하는 클래스를 호출하는 방식
 주문상태코드='0001'; : 각 회사마다 주문상태에대한 정보와 관리하는 항목이 다를수있으므로상태정보를 따로관린한ㄷ
 주문정보할인율=0.1; 
 주문업종코드='A';
 주문승인일자=현재일자;  : 회사마다 주문의 추가소것ㅇ이 다르므로 사용자 소것ㅇ 및 변이 속성을 관리해야 한다. 
 
 
 
 
 
 
 
 
 
 
 
 
 


