import { NativeModules } from 'react-native';

type AppReviewType = {
  launch(): void;
};

const { AppReview } = NativeModules;

export default AppReview as AppReviewType;
