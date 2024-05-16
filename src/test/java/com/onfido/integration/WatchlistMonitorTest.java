package com.onfido.integration;

import com.onfido.model.*;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WatchlistMonitorTest extends TestBase {
  private UUID applicantId;

  @BeforeEach
  public void setup() throws Exception {
    applicantId = createApplicant().getId();
  }

  @Test
  public void createWatchlistStandardMonitor() throws Exception {
    WatchlistMonitor monitor =
        createWatchlistMonitor(applicantId, WatchlistMonitorBuilder.ReportNameEnum.STANDARD);

    Assertions.assertEquals(applicantId, monitor.getApplicantId());
    Assertions.assertEquals(WatchlistMonitor.ReportNameEnum.STANDARD, monitor.getReportName());
  }

  @Test
  public void createWatchlistAmlMonitor() throws Exception {
    WatchlistMonitor monitor =
        createWatchlistMonitor(applicantId, WatchlistMonitorBuilder.ReportNameEnum.AML);

    Assertions.assertEquals(applicantId, monitor.getApplicantId());
    Assertions.assertEquals(WatchlistMonitor.ReportNameEnum.AML, monitor.getReportName());
  }

  @Test
  public void listWatchlistMonitors() throws Exception {
    createWatchlistMonitor(applicantId, WatchlistMonitorBuilder.ReportNameEnum.STANDARD);

    WatchlistMonitorsList listOfMonitors = onfido.listWatchlistMonitors(applicantId, false);
    Assertions.assertFalse(listOfMonitors.getMonitors().isEmpty());
  }

  @Test
  public void findWatchlistMonitor() throws Exception {
    UUID monitorId =
        createWatchlistMonitor(applicantId, WatchlistMonitorBuilder.ReportNameEnum.STANDARD)
            .getId();

    WatchlistMonitor monitor = onfido.findWatchlistMonitor(monitorId);
    Assertions.assertEquals(monitorId, monitor.getId());
  }

  @Test
  public void deleteWatchlistMonitor() throws Exception {
    UUID monitorId =
        createWatchlistMonitor(applicantId, WatchlistMonitorBuilder.ReportNameEnum.STANDARD)
            .getId();

    onfido.deleteWatchlistMonitor(monitorId);
  }

  @Test
  public void listWatchlistMonitorMatches() throws Exception {
    UUID monitorId =
        createWatchlistMonitor(applicantId, WatchlistMonitorBuilder.ReportNameEnum.STANDARD)
            .getId();

    WatchlistMonitorMatchesList matches = onfido.listWatchlistMonitorMatches(monitorId);
    Assertions.assertTrue(matches.getMatches().isEmpty());
  }

  @Test
  public void forceReportCreation() throws Exception {
    UUID monitorId =
        createWatchlistMonitor(applicantId, WatchlistMonitorBuilder.ReportNameEnum.STANDARD)
            .getId();

    onfido.forceReportCreationFromWatchlistMonitor(monitorId);
  }
}
