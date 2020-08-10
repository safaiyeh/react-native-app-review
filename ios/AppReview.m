#import "AppReview.h"
#import <StoreKit/SKStoreReviewController.h>

@implementation AppReview

- (dispatch_queue_t)methodQueue
{
  return dispatch_get_main_queue();
}

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(launch)
{
  [SKStoreReviewController requestReview];
}

+ (BOOL)requiresMainQueueSetup
{
  return YES;
}

@end
