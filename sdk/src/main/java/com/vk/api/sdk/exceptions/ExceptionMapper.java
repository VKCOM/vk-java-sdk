package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ExceptionMapper {
    public static ApiException parseException(Error error) {
        switch (error.getErrorCode()) {
            case 1:
                return new ApiUnknownException(error.getErrorMsg());
            case 2:
                return new ApiDisabledException(error.getErrorMsg());
            case 3:
                return new ApiMethodException(error.getErrorMsg());
            case 4:
                return new ApiSignatureException(error.getErrorMsg());
            case 260:
                return new ApiAccessGroupsException(error.getErrorMsg());
            case 5:
                return new ApiAuthException(error.getErrorMsg());
            case 6:
                return new ApiTooManyException(error.getErrorMsg());
            case 7:
                return new ApiPermissionException(error.getErrorMsg());
            case 8:
                return new ApiRequestException(error.getErrorMsg());
            case 9:
                return new ApiFloodException(error.getErrorMsg());
            case 10:
                return new ApiServerException(error.getErrorMsg());
            case 11:
                return new ApiEnabledInTestException(error.getErrorMsg());
            case 14:
                return new ApiCaptchaException(error.getErrorMsg(), error.getCaptchaSid(), error.getCaptchaImg());
            case 270:
                return new ApiAudioClaimedException(error.getErrorMsg());
            case 15:
                return new ApiAccessException(error.getErrorMsg());
            case 16:
                return new ApiAuthHttpsException(error.getErrorMsg());
            case 17:
                return new ApiAuthValidationException(error.getErrorMsg(), error.getRedirectUri());
            case 18:
                return new ApiUserDeletedException(error.getErrorMsg());
            case 19:
                return new ApiBlockedException(error.getErrorMsg());
            case 20:
                return new ApiMethodPermissionException(error.getErrorMsg());
            case 21:
                return new ApiMethodAdsException(error.getErrorMsg());
            case 22:
                return new ApiUploadException(error.getErrorMsg());
            case 23:
                return new ApiMethodDisabledException(error.getErrorMsg());
            case 24:
                return new ApiNeedConfirmationException(error.getErrorMsg(), error.getConfirmationText());
            case 1310:
                return new ApiCommunitiesCatalogDisabledException(error.getErrorMsg());
            case 1311:
                return new ApiCommunitiesCategoriesDisabledException(error.getErrorMsg());
            case 800:
                return new ApiVideoAlreadyAddedException(error.getErrorMsg());
            case 801:
                return new ApiVideoCommentsClosedException(error.getErrorMsg());
            case 300:
                return new ApiAlbumFullException(error.getErrorMsg());
            case 301:
                return new ApiFilenameException(error.getErrorMsg());
            case 302:
                return new ApiAlbumsLimitException(error.getErrorMsg());
            case 1105:
                return new ApiAuthFloodErrorException(error.getErrorMsg());
            case 1110:
                return new ApiAuthParamCodeException(error.getErrorMsg());
            case 1111:
                return new ApiAuthParamPasswordException(error.getErrorMsg());
            case 600:
                return new ApiAdsPermissionException(error.getErrorMsg());
            case 1112:
                return new ApiAuthDelayException(error.getErrorMsg());
            case 601:
                return new ApiWeightedFloodException(error.getErrorMsg());
            case 602:
                return new ApiAdsPartialSuccessException(error.getErrorMsg());
            case 603:
                return new ApiAdsSpecificException(error.getErrorMsg());
            case 604:
                return new ApiAdsParamDomainInvalidException(error.getErrorMsg());
            case 605:
                return new ApiAdsParamDomainForbiddenException(error.getErrorMsg());
            case 606:
                return new ApiAdsParamDomainReservedException(error.getErrorMsg());
            case 607:
                return new ApiAdsParamDomainOccupiedException(error.getErrorMsg());
            case 608:
                return new ApiAdsParamDomainActiveException(error.getErrorMsg());
            case 609:
                return new ApiAdsParamDomainAppInvalidException(error.getErrorMsg());
            case 610:
                return new ApiAdsParamDomainAppForbiddenException(error.getErrorMsg());
            case 611:
                return new ApiAdsAppNotVerifiedException(error.getErrorMsg());
            case 100:
                return new ApiParamException(error.getErrorMsg());
            case 612:
                return new ApiAppNotInSiteDomainsException(error.getErrorMsg());
            case 101:
                return new ApiParamApiIdException(error.getErrorMsg());
            case 613:
                return new ApiAdsAppBlockedException(error.getErrorMsg());
            case 103:
                return new ApiLimitsException(error.getErrorMsg());
            case 104:
                return new ApiNotFoundException(error.getErrorMsg());
            case 105:
                return new ApiSaveFileException(error.getErrorMsg());
            case 106:
                return new ApiActionFailedException(error.getErrorMsg());
            case 113:
                return new ApiParamUserIdException(error.getErrorMsg());
            case 114:
                return new ApiParamAlbumIdException(error.getErrorMsg());
            case 118:
                return new ApiParamServerException(error.getErrorMsg());
            case 119:
                return new ApiParamTitleException(error.getErrorMsg());
            case 1400:
                return new ApiMarketRestoreTooLateException(error.getErrorMsg());
            case 121:
                return new ApiParamHashException(error.getErrorMsg());
            case 1401:
                return new ApiMarketCommentsClosedException(error.getErrorMsg());
            case 122:
                return new ApiParamPhotosException(error.getErrorMsg());
            case 1402:
                return new ApiMarketAlbumNotFoundException(error.getErrorMsg());
            case 123:
                return new ApiParamAudioException(error.getErrorMsg());
            case 1403:
                return new ApiMarketItemNotFoundException(error.getErrorMsg());
            case 1404:
                return new ApiMarketItemAlreadyAddedException(error.getErrorMsg());
            case 125:
                return new ApiParamGroupIdException(error.getErrorMsg());
            case 1405:
                return new ApiMarketTooManyItemsException(error.getErrorMsg());
            case 1150:
                return new ApiParamDocIdException(error.getErrorMsg());
            case 1406:
                return new ApiMarketTooManyItemsInAlbumException(error.getErrorMsg());
            case 1151:
                return new ApiParamDocDeleteAccessException(error.getErrorMsg());
            case 1407:
                return new ApiMarketTooManyAlbumsException(error.getErrorMsg());
            case 1152:
                return new ApiParamDocTitleException(error.getErrorMsg());
            case 129:
                return new ApiParamPhotoException(error.getErrorMsg());
            case 1153:
                return new ApiParamDocAccessException(error.getErrorMsg());
            case 900:
                return new ApiMessagesUserBlockedException(error.getErrorMsg());
            case 901:
                return new ApiMessagesDenySendException(error.getErrorMsg());
            case 902:
                return new ApiMessagesPrivacyException(error.getErrorMsg());
            case 913:
                return new ApiMessagesForwardAmountExceededException(error.getErrorMsg());
            case 914:
                return new ApiMessagesLongMessageException(error.getErrorMsg());
            case 917:
                return new ApiMessageInviteLinkNoAccessException(error.getErrorMsg());
            case 919:
                return new ApiMessagesForbiddenInviteLinkException(error.getErrorMsg());
            case 921:
                return new ApiMessagesForwardUnableException(error.getErrorMsg());
            case 1160:
                return new ApiPhotoChangedException(error.getErrorMsg());
            case 140:
                return new ApiParamPageIdException(error.getErrorMsg());
            case 141:
                return new ApiAccessPageException(error.getErrorMsg());
            case 146:
                return new ApiMobileNotActivatedException(error.getErrorMsg());
            case 1170:
                return new ApiTooManyListsException(error.getErrorMsg());
            case 147:
                return new ApiInsufficientFundsException(error.getErrorMsg());
            case 148:
                return new ApiAccessMenuException(error.getErrorMsg());
            case 150:
                return new ApiParamTimestampException(error.getErrorMsg());
            case 171:
                return new ApiFriendsListIdException(error.getErrorMsg());
            case 173:
                return new ApiFriendsListLimitException(error.getErrorMsg());
            case 174:
                return new ApiFriendsAddYourselfException(error.getErrorMsg());
            case 175:
                return new ApiFriendsAddInEnemyException(error.getErrorMsg());
            case 176:
                return new ApiFriendsAddEnemyException(error.getErrorMsg());
            case 180:
                return new ApiParamNoteIdException(error.getErrorMsg());
            case 181:
                return new ApiAccessNoteException(error.getErrorMsg());
            case 182:
                return new ApiAccessNoteCommentException(error.getErrorMsg());
            case 183:
                return new ApiAccessCommentException(error.getErrorMsg());
            case 700:
                return new ApiGroupChangeCreatorException(error.getErrorMsg());
            case 701:
                return new ApiGroupNotInClubException(error.getErrorMsg());
            case 702:
                return new ApiGroupTooManyOfficersException(error.getErrorMsg());
            case 190:
                return new ApiSameCheckinException(error.getErrorMsg());
            case 191:
                return new ApiAccessCheckinException(error.getErrorMsg());
            case 200:
                return new ApiAccessAlbumException(error.getErrorMsg());
            case 201:
                return new ApiAccessAudioException(error.getErrorMsg());
            case 203:
                return new ApiAccessGroupException(error.getErrorMsg());
            case 204:
                return new ApiAccessVideoException(error.getErrorMsg());
            case 205:
                return new ApiAccessMarketException(error.getErrorMsg());
            case 210:
                return new ApiWallAccessPostException(error.getErrorMsg());
            case 211:
                return new ApiWallAccessCommentException(error.getErrorMsg());
            case 212:
                return new ApiWallAccessRepliesException(error.getErrorMsg());
            case 213:
                return new ApiWallAccessAddReplyException(error.getErrorMsg());
            case 214:
                return new ApiWallAddPostException(error.getErrorMsg());
            case 219:
                return new ApiWallAdsPublishedException(error.getErrorMsg());
            case 220:
                return new ApiWallTooManyRecipientsException(error.getErrorMsg());
            case 221:
                return new ApiStatusNoAudioException(error.getErrorMsg());
            case 222:
                return new ApiWallLinksForbiddenException(error.getErrorMsg());
            case 224:
                return new ApiWallAdsPostLimitReachedException(error.getErrorMsg());
            case 1251:
                return new ApiAppsAlreadyUnlockedException(error.getErrorMsg());
            case 1000:
                return new ApiParamPhoneException(error.getErrorMsg());
            case 1004:
                return new ApiPhoneAlreadyUsedException(error.getErrorMsg());
            case 1260:
                return new ApiInvalidAddressException(error.getErrorMsg());
            case 500:
                return new ApiVotesPermissionException(error.getErrorMsg());
            case 503:
                return new ApiVotesException(error.getErrorMsg());
            case 250:
                return new ApiPollsAccessException(error.getErrorMsg());
            case 251:
                return new ApiPollsPollIdException(error.getErrorMsg());
            case 252:
                return new ApiPollsAnswerIdException(error.getErrorMsg());
            case 2100:
                return new ApiLongPollException(error.getErrorMsg());
            default:
                return new ApiException(error.getErrorCode(), error.getErrorMsg());
        }
    }
}
