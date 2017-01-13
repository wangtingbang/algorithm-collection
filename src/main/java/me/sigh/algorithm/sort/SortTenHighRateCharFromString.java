package me.sigh.algorithm.sort;

import java.util.*;

/*************************************************************************
 * > File Name: SortTenHighRateCharFromString.java
 * > Author: wang tingbang
 * > Mail: wangtingbang@gmail.com
 * > Created Time: 2017/1/13 11:21:51
 ************************************************************************/

public class SortTenHighRateCharFromString {
  public static void main(String[] argv) {
    String str = "ZZOracleCountryCommunitiesIamaIwanttoSignInRegisterHelpSearchSUBMITSEARCHProductsSolutionsDownloadsStoreSupportTrainingPartnersAboutOTNOracleTechnologyNetworkJavaJavaSEOverviewJavaSEJavaEEJavaMEJavaSESupportJavaSEAdvancedSuiteJavaEmbeddedJavaDBWebTierJavaCardJavaTVNewtoJavaCommunityJavaMagazineOverviewDownloadsDocumentationCommunityTechnologiesTrainingJavaSEataGlanceLicenseesGeneralFAQsFeaturesJavaPlatformStandardEditionJavaSEletsyoudevelopanddeployJavaapplicationsondesktopsandserversaswellasintodaysdemandingembeddedenvironmentsJavaofferstherichuserinterfaceperformanceversatilityportabilityandsecuritythattodaysapplicationsrequireAutoupdateNoticeEndofPublicUpdatesforOracleJDKCoincidentwiththeJanuaryCPUreleaseuserswiththeautoupdatefeatureenabledweremigratedfromOracleJREtoOracleJREAlsopleasenotetheAprilCPUreleasewasthelastOracleJDKpubliclyavailableupdateFormoreinformationanddetailsonhowtoreceivelongertermsupportforOracleJDKpleaseseetheOracleJavaSESupportRoadmapWhatsNewJavaPlatformStandardEditionUpdateJavaSEuandStandardEditionUpdateJavaSEuarenowavailableThislatestreleaseoftheJavaPlatformincludesimportantsecurityfixesOraclestronglyrecommendsthatallJavaSEusersupgradetothisreleaseJDKforARMreleasesareavailableonthesamepageasthedownloadsforotherplatformsarrowDownloadarrowReleaseNotesAdvancedManagementConsoleProvidessystemadministratorsaneffectivecontroloverdiverseJavaversionsrunningondesktopsintheenterpriseenablingamoresecureenvironmentandenhancedapplicationexperienceandavailabilityDocumentationJavaSEisNowAvailableTheJavaPlatformStandardEditionJavaSEisamajorfeaturereleaseItcontainsnewfeaturesandenhancementsinmanyfunctionalareasJavaSEdeliversenhanceddeveloperproductivityandsignificantapplicationperformanceincreasesthroughreducedboilerplatecodeimprovedcollectionsandannotationssimplerparallelprogrammingmodelsandmoreefficientuseofmodernmulticoreprocessorsSeewhatsnewinJDKformoredetailsarrowDownloadarrowReleaseNotesSecurityoftheJavaPlatformAdescriptionofsecurityinformationprovidedbyroleFordeveloperssystemadministratorshomeusersandsecurityprofessionalsJavaRIASecurityChecklistRecentlyannouncedchangesscheduledforJavaupdateJanuaryhaveestablishedthatthedefaultsecuritysliderwillrequirecodesignaturesandthePermissionsManifestattributeThischecklistisintendedtoprovidebestpracticestohelpdevelopmentteamstrackworknecessarytoaccommodateuserpromptsLiveConnectchangesinuJavaupdateOctoberintroducesanewwarningtousersofLiveConnectapplicationsLiveConnectisatechnologyforRichInternetApplicationsthatallowsJavaScriptonawebpagetomakecallsintoanRIAallowingthetwotoworktogetherandloadcontentRIAsthatdonotuseLiveConnectareunaffectedbythischangeReadMoreOracleReleasesNewDiagnosticMonitoringSecurityandDeploymentCapabilitiesforJavaSEPressReleaseVideoJavaMissionControlJavaFlightRecorderandJavaMissionControltogethercreateacompletetoolchaintocontinuouslycollectlowlevelanddetailedruntimeinformationenablingafterthefactincidentanalysisReleaseNotesDemoWhitePaperDeploymentRuleSetDeploymentrulesetallowsadesktopadministratortocontrolthelevelofJavaclientcompatibilityanddefaultpromptsacrossanorganizationDocumentationJavaAPIDocumentationUpdaterToolJavaUsageTrackingandVisualizationwithOracleFusionMiddlewareServerJREStartingwithJavaSEuaServerJavaRuntimeEnvironmentServerJREpackageisavailablefordeployingJavaapplicationsonserversLearnMoreJavaAppletWebStartCodeSigningStartingwithJavaSEuallJavaAppletsandWebStartApplicationsareencouragedtobesignedwithatrustedcertificateLearnMoreArchiveofTechnicalArticlesUpdatesJavaSEuanduReleasedJavaSEuanduarethelatestSecurityAlertreleasesforJDKarrowReleaseNotesarrowDownloadcommunityProductsandTrainingOracleJavaSEAdvancedSuiteExpertmonitoringdiagnosticsandcentralizedmanagementforenterpriseandISVJavabasedapplicationsOracleJavaSESupportAccessOraclePremierSupportforthecomponentsandfeaturesincludedwithJavaSETrainingCertificationJavaSEProgrammingJavaSEFundamentalsJavaSENewFeaturesJavaPerformanceTuningwithMissionControlandFlightRecorderJavaSECertificationRaisingTheBarJavaTrainingOracleUniversityLearnMoreaboutJavaSoftwareJavacanreducecostsdriveinnovationandimproveapplicationservicescommunityCommunityJavaOneJavaOnehasconcludedbuttheLearningLivesOnDidyoumissaJavaOnekeynoteorsessionYoucanfindthosehereAndSavetheDateforOracleOpenWorldSeptemberJavaEventKitAccesstheCreatetheFuturewithJavaEventKitrunyourownJavaeventusingtheresourcesdesignedforJavaUserGroupsJUGsThekitincludesafullyscriptedtechnicalpresentationintrovideopromotionaltoolsandmoreLearnMoreAdoptaJSRProgramThisprogramisintendedtoencourageJUGmemberstogetinvolvedinaJavaSpecificationRequestJSRandtoevangelisethatJSRtotheirJUGandthewiderJavacommunityinordertoincreasegrassrootsparticipationLearnMoreJavanetTheSourceforJavaTechnologyCollaborationJavaEmbeddedCommunityJavaFXCommunityNightHackingLogoNighthackingcomTheNightHackingJavaTouristheinaugurallegoftheJavaToureventwheretheevangelismteamwillbecrossingtheglobetospeakatconferencesandJavaUserGroupstospreadthewordaboutthenewJavareleaseParticipateMaketheFutureJavaOutreachProgramTogetherwecaninspirefuturetechnologiststolearnmoreaboutJavaandtheopportunitiesitbringsTheMaketheFutureJavaprogramoffersresourcestoolkitsandpromotionalitemsyoucanuseforJavaoutreachwithinyourlocalcommunityJoinaJavaUserGroupJUGJavaUserGroupsJUGsarevolunteerorganizationsthatstrivetodistributeJavarelatedknowledgearoundtheworldTheyprovideameetingplaceforJavauserstogetinformationshareresourcesandsolutionsincreasenetworkingexpandJavaTechnologyexpertiseandabovealldrinkbeereatpizzaandhavefunFindaJUGandbecomeapartoftheJavacommunitytodayJavaForumsICodeJavaReadaboutandshareideasandsuggestionsaboutJavatechnologyonthediscussionforumsStartwiththeNewtoJavaorthemoreadvancedJavaProgrammingcategoryGimmeJavaShowyourtruecolorsTheseJavadesignsareyourstotakeandusePostonyourWebsiteputthemontshirtsorcoffeemugsusethemjustaboutanywhereexceptonaJavaproductandlettheworldknowaboutyourpassionforJavaJavaSESiteMapLeftCurveJavaSDKsandToolsRightCurveJavaSEJavaEEandGlassfishJavaMEJavaCardNetBeansIDEJavaMissionControlLeftCurveJavaResourcesRightCurveJavaAPIsTechnicalArticlesDemosandVideosForumsJavaMagazineJavanetDeveloperTrainingTutorialsJavacomEmailthispageEmailthispagePrinterViewPrinterViewORACLECLOUDLearnAboutOracleCloudComputingGetaFreeTrialLearnAboutDaaSLearnAboutSaaSLearnAboutPaaSLearnAboutIaaSLearnAboutPrivateCloudLearnAboutManagedCloudJAVALearnAboutJavaDownloadJavaforConsumersDownloadJavaforDevelopersJavaResourcesforDevelopersJavaCloudServiceJavaMagazineCUSTOMERSANDEVENTSExploreandReadCustomerStoriesAllOracleEventsOracleOpenWorldJavaOneEMAILSUBSCRIPTIONSSubscriptionCenterCOMMUNITIESBlogsDiscussionForumsWikisOracleACEsUserGroupsSocialMediaChannelsSERVICESANDSTORELogIntoMyOracleSupportTrainingandCertificationBecomeaPartnerFindaPartnerSolutionPurchasefromtheOracleStoreSourceCodeforOpenSourceSoftwareCONTACTANDCHATUSSalesGlobalContactsOracleSupportPartnerSupportIntegratedCloudApplicationsandPlatformServicesOracleSubscribeCareersContactUsSiteMapsLegalNoticesTermsofUsePrivacyCookiePreferencesAdChoicesOracleMobileFacebookLinkedInTwitterGoogleYouTubeOracleRSSFeed";
    findTenHighRateCharString(str);
//    stat(str);
  }


  public static String findTenHighRateCharString(final String var){
    if(var==null||"".equals(var)){
      return null;
    }

    final int size = 26*2;

    int[] dic = new int[size];

    char[] arr = var.toCharArray();

    //count
    for(char ch:arr){
      int idx = (int)ch;
      int pos = idx;
      if(idx>=(int)'a'){
        pos-=6;//special char
      }
      pos-=(int)'A';
      dic[pos]++;
//      System.out.printf("%c(%d):%d\n", ch,pos, dic[pos]);
    }
    System.out.println();

    int[] hit = new int[10];

    //sort for first 10
    /*
    int low = 0;
    for(int idx = 0; idx<size;idx++) {
      if (dic[idx] == 0) {
        continue;
      }
      if (dic[idx] <= hit[9]) {
        continue;
      }
      //这个时候很明显要改东西了
      for(int inn = 0; inn <10;inn++) {
        if(dic[hit[inn]]==0){
          hit[inn] = idx;
          break;
        }
        if(dic[idx]>dic[hit[inn]]){
          for(int tmp = 9; tmp>inn; tmp--){
            hit[tmp] = hit[tmp-1];
          }
          hit[inn] = idx;
        }
      }
    }//*/


    //TEST
    for(int idx = 0; idx<dic.length;idx++) {
      char ch = dic[idx]+'A'+6>='a'?(char) (dic[idx]+(int)'A'+6):(char)(dic[idx]+(int)'A');
      System.out.printf("(%d):%d, %c\n", idx, dic[idx], ch);
    }

    // trans to string
    StringBuffer result = new StringBuffer();
    for(int idx = 0; idx<hit.length;idx++) {
      char ch = dic[hit[idx]]+'A'+6>='a'?(char) (dic[hit[idx]]+(int)'A'+6):(char)(dic[hit[idx]]+(int)'A');
//      System.out.printf("(%d):%d, %c\n", idx, hit[idx], ch);
      result.append(ch);
    }
    System.out.printf("%s", result.toString());
    return null;
  }
}
