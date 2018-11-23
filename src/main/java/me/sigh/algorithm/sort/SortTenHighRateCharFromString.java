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
    str = "ZZOracleCountry";
    findTenHighRateCharString(str);
  }


  public static String findTenHighRateCharString(final String var){
    if(var==null||"".equals(var)){
      return null;
    }
    
    //TODO
    if(var.length()<10){
      return var;
    }

    final int size = 26*2;
    int[] dic = new int[size]; // index: char assi(computed), value: count
    char[] arr = var.toCharArray();
    /*
     * first ten high rated char,
     * index: order, 0-high, 10-low,
     * value: index of dic
     */
    int[] hit = new int[10];
    int lowerHit = 0; //index for lower value in hit
    //count
    for(char ch:arr){
      int idx = (int)ch;
      int pos = idx;
      if(idx>=(int)'a'){
        pos-=6;//special char
      }
      pos-=(int)'A';
      dic[pos]++;
      if(hit[lowerHit]<dic[pos]&&pos!=hit[lowerHit]){

//        System.out.printf("lowerHit:%d, dic pos:%d, dic value %d, dic[pos]:%c\n", lowerHit, pos, dic[pos], ch);
        hit = insert(dic, hit, pos);
        lowerHit = getLowerHit(hit);
      }
    }

    // trans to string
    StringBuffer result = new StringBuffer();
    for(int idx = 0; idx<hit.length;idx++) {
      char ch = hit[idx]+'A'+6>='a'
        ?(char) (hit[idx]+(int)'A'+6)
        :(char)(hit[idx]+(int)'A');
      result.append(ch);
    }
    System.out.printf("%s\n", result.toString());
    return result.toString();
  }

  /**
   *
   * @param dic
   * @param hit
   * @param pos
   * @return
   */
  private static int[] insert(int[] dic, int[] hit, int pos){
    int value = dic[pos];
    //for(int i = 0; i<hit.length && hit[i]>0; i++){
    for(int i = 0; i<hit.length; i++){
      if(value > dic[hit[i]]){
        System.out.printf("hit[%d] %d==%d), %s\n", i, hit[i], pos, hit[i]==pos);
        if(hit[i]==pos){
          System.out.printf("hit[%d]==%d), break\n", hit[i], pos);
          break;
        }
        System.out.printf("insert value %d at position %d of hit\n", value, i);
        for(int j=hit.length-1; j>i;j--){
          hit[j] = hit[j-1];
        }
        hit[i] = pos;
        break;
      }
    }
    return hit;
  }

  private static int getLowerHit(int hit[]){
    for(int idx = 0;idx<hit.length;idx++){
      if(hit[idx]<=1){
        return idx;
      }
    }
    return hit.length-1;
  }
  
}
