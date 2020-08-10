import { NativeModules } from 'react-native';

type AppReviewType = {
  multiply(a: number, b: number): Promise<number>;
};

const { AppReview } = NativeModules;

export default AppReview as AppReviewType;
