import * as React from 'react';
import { StyleSheet, View } from 'react-native';
import AppReview from 'react-native-app-review';

export default function App() {
  AppReview.launch();

  return <View style={styles.container} />;
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
